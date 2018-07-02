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
import com.vzionsys.ssm.mapper.TtFundDataMapper;
import com.vzionsys.ssm.po.ScrTnac;
import com.vzionsys.ssm.po.ScrTnacExample;
import com.vzionsys.ssm.po.ScrTxndnInf;
import com.vzionsys.ssm.po.ScrTxndnInfExample;
import com.vzionsys.ssm.po.Similarity;
import com.vzionsys.ssm.po.SimilarityExample;
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
	
	
	public String selectByExample(String fundNum,String uploadBatch, String taskBatch){
		
		long ct = System.currentTimeMillis();
		ScrTnacExample scatnaExample = new ScrTnacExample();
		ScrTxndnInfExample scrTxndnInfExample = new ScrTxndnInfExample();
		SimilarityExample similarityExample = new SimilarityExample();
		TtFundDataExample ttFundDataExample = new TtFundDataExample();
		
		List<ScrTnac> userlist = scrTnacMapper.selectByExample(scatnaExample);
		List<ScrTxndnInf> datalist = new ArrayList<>();
		List<Similarity> similaritieList = new ArrayList<>();
		List<TtFundData> list = new ArrayList<>(); 
		Map<String,Map<String,Integer>> userMap = new HashMap<String,Map<String,Integer>>();
		Map<String,Integer> map;
		
		
		ttmaDataMapper.deleteByExample(ttFundDataExample);
	    similarityExample.createCriteria().andFundIdFirstEqualTo(fundNum);
		similaritieList = similarityMapper.selectByExample(similarityExample);
		
		String SCR_TXN_ACCNO = "";
		String SCR_PD_ECD = "";
		datalist = scrTxndnInfMapper.selectByExample(scrTxndnInfExample);
		for(int i = 0; i < datalist.size(); i++){
			ScrTxndnInf scrTnac = datalist.get(i);
			SCR_TXN_ACCNO = scrTnac.getScrTxnAccno();
			SCR_PD_ECD = scrTnac.getScrPdEcd();
			if(userMap.containsKey(SCR_TXN_ACCNO)){
			    map = userMap.get(SCR_TXN_ACCNO);
				if(map.containsKey(SCR_PD_ECD)){
					int num = map.get(SCR_PD_ECD);
					map.put(SCR_PD_ECD, num + 1);
				}
				else{
					map.put(SCR_PD_ECD, 1);
				}
			}
			else{
				map = new  HashMap<String,Integer>();
				map.put(SCR_PD_ECD, 1);
				userMap.put(SCR_TXN_ACCNO, map);
			}
		}
			
		
		//根据基金号推荐用户
		double result;
		int listSize = 0;
		int size;
		for(int i = 0; i < userlist.size(); i++){
			ScrTnac scrTnac = userlist.get(i);
			SCR_TXN_ACCNO = scrTnac.getScrTxnAccno();
			System.out.println(SCR_TXN_ACCNO);
			map = userMap.get(SCR_TXN_ACCNO);

			if((map == null)||(map.containsKey(fundNum))){
				continue;
			}
			result = 0;
			size = 0;
			//size = userMap.get(SCR_TXN_ACCNO).size();
			Map<String,Integer> usermap = new  HashMap<>();
			usermap = userMap.get(SCR_TXN_ACCNO);
			for(int num : usermap.values()){
				size += num;
			}
			
		    for(int j = 0; j < similaritieList.size(); j++){
		    	Similarity similarity = similaritieList.get(j);
		    	String val = similarity.getFundIdSecond();
		    	double score = Double.valueOf(similarity.getScore());
		    	if(userMap.get(SCR_TXN_ACCNO).containsKey(val)){
		    		result += score * ((double) usermap.get(val) / size);
		    	}
		    }
			
		    
		    if(result == 0) continue;
		    TtFundData ttFundData = new TtFundData();
		    ttFundData.setUserid(SCR_TXN_ACCNO);
		    ttFundData.setProbility(String.valueOf(result));
		    ttFundData.setTaskBatch(taskBatch);
		    SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd");
		    Date time = null;
			try {
				time = sdf.parse(sdf.format(new Date()));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    ttFundData.setCreateDate(time);
		    list.add(ttFundData);
		    listSize++;
		    if(listSize == 1000){
		    	ttmaDataMapper.insertList(list);
		    	list.clear();
		    	listSize = 0;
		    }
		}
		
		if(list.size() > 0) ttmaDataMapper.insertList(list);
		System.out.println("耗时:"+ (System.currentTimeMillis() - ct));
		String message = "访问成功";
		return message;
		
	}
	
	
	
	
}
