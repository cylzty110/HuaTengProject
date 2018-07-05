package com.vzionsys.ssm.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.vzionsys.ssm.mapper.ScrTnacMapper;
import com.vzionsys.ssm.mapper.ScrTxndnInfMapper;
import com.vzionsys.ssm.mapper.SimilarityMapper;
import com.vzionsys.ssm.mapper.TsTaskInfoMapper;
import com.vzionsys.ssm.mapper.TtFundDataMapper;
import com.vzionsys.ssm.po.ScrTnac;
import com.vzionsys.ssm.po.ScrTnacExample;
import com.vzionsys.ssm.po.ScrTxndnInf;
import com.vzionsys.ssm.po.ScrTxndnInfExample;
import com.vzionsys.ssm.po.Similarity;
import com.vzionsys.ssm.po.SimilarityExample;
import com.vzionsys.ssm.po.TsTaskInfo;
import com.vzionsys.ssm.po.TsTaskInfoExample;
import com.vzionsys.ssm.po.TtFundData;
import com.vzionsys.ssm.po.TtFundDataExample;
import com.vzionsys.ssm.service.SqlService;

@Service
public  class SqlServiceImpl implements SqlService {
	
	@Resource
	private ScrTnacMapper scrTnacMapper;
	@Resource
	private ScrTxndnInfMapper scrTxndnInfMapper;
	@Resource
	private SimilarityMapper similarityMapper;
	@Resource
	private TtFundDataMapper ttmaDataMapper;
	@Resource
	private TsTaskInfoMapper tsTaskInfoMapper;
	
	
	public String selectByExample(String fundNum,String tnacUploadBatch,String txndnUploadBatch ,String taskBatch){
		
		int count = 0;
		String SCR_TXN_ACCNO = "";
		String SCR_PD_ECD = "";
		
		SimilarityExample similarityExample = new SimilarityExample();
		
		List<ScrTnac> userlist = scrTnacMapper.selectAll(tnacUploadBatch);
		List<ScrTxndnInf> datalist = new ArrayList<>();
		List<String> fundList = new ArrayList<>(); 
		List<String> list = new ArrayList<>();
		List<TtFundData> ttFundDatas = new ArrayList<>();
		List<Similarity> similarityList = new ArrayList<>();
		
		Map<String,Map<String,Double>> relationMap = new HashMap<>();//相似度矩阵
		Map<String,Integer> userMap = new HashMap<>();//每款基金购买用户
		Set<String> fundSet = new HashSet<>();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
	    Date time = null;
		try {
			time = sdf.parse(sdf.format(new Date()));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		long ct = System.currentTimeMillis();
		similarityMapper.deleteByExample(similarityExample);
		//计算相似度矩阵-step1
		for(int i = 0; i < userlist.size() ; i++){
			list.add(userlist.get(i).getScrTxnAccno());
			count++;
			if((count == 1000) || (i == userlist.size()-1)){
				count = 0;
				datalist = scrTxndnInfMapper.selectByAccnos(list,txndnUploadBatch);
				for(int j = 0; j < datalist.size(); j++){
					SCR_TXN_ACCNO = datalist.get(j).getScrTxnAccno();
					SCR_PD_ECD = datalist.get(j).getScrPdEcd();
					if(userMap.containsKey(SCR_PD_ECD)){
						int num = userMap.get(SCR_PD_ECD);
						userMap.put(SCR_PD_ECD, num + 1);
					}
					else{
						userMap.put(SCR_PD_ECD,1);
					}
					fundSet.add(SCR_PD_ECD);
				}
				
				if(fundSet.size() > 0){
					for(String s : fundSet) fundList.add(s);
				}
				
				for(int j = 0; j < fundList.size(); j++){
	                String firstid = fundList.get(j);
	                if(!relationMap.containsKey(firstid)){
	                    Map<String,Double> innermap = new HashMap<>();
	                    relationMap.put(firstid, innermap);
	                }
	                Map<String,Double> tempinnermap = relationMap.get(firstid);
	                for(int k = 0; k <fundList.size(); k++){
	                    if(j == k) continue;
	                    String secondid = fundList.get(k);
	                    if (!tempinnermap.containsKey(secondid)) {
	                        tempinnermap.put(secondid, 1.0);
	                    } else {
	                        double num = tempinnermap.get(secondid) + 1;
	                        tempinnermap.put(secondid, num);
	                    }
	                }
	            }
				list.clear();
				fundSet.clear();
			}
		}
		
		//计算相似度矩阵-step2
		int listSize = 0;
		int resultSize = 0;
		double val = 0;
		double maxval = 0;
		similarityList = new ArrayList<>();
		for(String userId : relationMap.keySet()){
			Map<String,Double> map = relationMap.get(userId);
			for(String fundId : map.keySet()){
				val = map.get(fundId);
				int num1 = userMap.get(userId);
				int num2 = userMap.get(fundId);
				val = val / Math.sqrt((double) num1) / Math.sqrt((double) num2);
				map.put(fundId, val);
				maxval = Math.max(val, maxval);
			}
			
			for(String fundId : map.keySet()){
				val = map.get(fundId);
				if(maxval == 0) val = 0;
				else val = val / maxval;
				Similarity similarity = new Similarity();
				similarity.setFundIdFirst(userId);
				similarity.setFundIdSecond(fundId);
				similarity.setScore(String.valueOf(val));
				similarityList.add(similarity);
				listSize++;
			    if(listSize == 1000){
			    	similarityMapper.insertList(similarityList);
			    	similarityList.clear();
			    	listSize = 0;
			    } 
			}		
		}
		
		
		
		if(similarityList.size() > 0) {
			similarityMapper.insertList(similarityList);
		}
		
		
		Map<String,Map<String,Integer>> buyMap = new HashMap<>();//购买记录
		count = 0;
		similarityExample.clear();
		similarityExample.createCriteria().andFundIdFirstEqualTo(fundNum);
		similarityList = similarityMapper.selectByExample(similarityExample);
		for(int i = 0; i < userlist.size(); i++){
			list.add(userlist.get(i).getScrTxnAccno());
			count++;
			if((count == 1000) || (i == userlist.size()-1)){
				datalist = scrTxndnInfMapper.selectByAccnos(list,txndnUploadBatch);
				for(int j = 0; j < datalist.size(); j++){
					SCR_TXN_ACCNO = datalist.get(j).getScrTxnAccno();
					SCR_PD_ECD = datalist.get(j).getScrPdEcd();
					if(buyMap.containsKey(SCR_TXN_ACCNO)){
						Map<String,Integer> map = buyMap.get(SCR_TXN_ACCNO);
						if(map.containsKey(SCR_PD_ECD)){
							int num = map.get(SCR_PD_ECD);
							map.put(SCR_PD_ECD, num + 1);
						}
						else{
							map.put(SCR_PD_ECD, 1);
						}
					}
					else{
						Map<String,Integer> map = new HashMap<>();
						map.put(SCR_PD_ECD, 1);
						buyMap.put(SCR_TXN_ACCNO, map);
					}
				}
				
				for(int j = 0; j < list.size(); j++){
					double result = 0;
					SCR_TXN_ACCNO = list.get(j);
					if(!buyMap.containsKey(SCR_TXN_ACCNO)) continue;
					if(buyMap.get(SCR_TXN_ACCNO).containsKey(fundNum)) continue;
					Map<String,Integer> map = buyMap.get(SCR_TXN_ACCNO);
					double sum = 0;
					
					for(String funid : map.keySet()){
						sum += map.get(funid);
					}
					
					for(int k = 0; k < similarityList.size(); k++){
						String fundId = similarityList.get(k).getFundIdSecond();
						double value = Double.valueOf(similarityList.get(k).getScore());
						if(map.containsKey(fundId)){
							result += value * (double)map.get(fundId) / sum;
						}
					}
							
					TtFundData ttFundData = new TtFundData();
					ttFundData.setProbility(String.valueOf(result));
					ttFundData.setUserid(SCR_TXN_ACCNO);
					ttFundData.setTaskBatch(taskBatch);
				    ttFundData.setCreateDate(time);
					ttFundDatas.add(ttFundData);
					if(ttFundDatas.size() > 1000){
						ttmaDataMapper.insertList(ttFundDatas);
						resultSize += ttFundDatas.size();
						ttFundDatas.clear();
					}
				}
				buyMap.clear();
				list.clear();
				count = 0;
			}
			
		}
		
		if(ttFundDatas.size() > 0) {
			ttmaDataMapper.insertList(ttFundDatas);
			resultSize += ttFundDatas.size();
		}
		
		TsTaskInfo tsTaskInfo = new TsTaskInfo();
		tsTaskInfo.setTaskStatus("2");
		tsTaskInfo.setTaskReturnMessage(String.valueOf(resultSize));
		tsTaskInfo.setTaskBatch(taskBatch);
		tsTaskInfo.setCreateUserId("admin");
		tsTaskInfo.setCreateDate(time);
		tsTaskInfo.setTaskReturnDate(sdf.format(time));
		tsTaskInfoMapper.insertSelective(tsTaskInfo);
		System.out.println("耗时:"+ (System.currentTimeMillis() - ct));
		return "N";
	}
	
	
	
	
}
