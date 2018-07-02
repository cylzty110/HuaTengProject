package com.vzionsys.ssm.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Service;

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
import com.vzionsys.ssm.po.TtFundDataExample;

@Service
public class InitializeImpl implements ApplicationListener<ContextRefreshedEvent>{
	
	@Resource
	private ScrTnacMapper scrTnacMapper;
	@Resource
	private ScrTxndnInfMapper scrTxndnInfMapper;
	@Resource
	private SimilarityMapper similarityMapper;
	@Resource
	private TtFundDataMapper ttmaDataMapper;
	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event){
		
		if(event.getApplicationContext().getParent() == null){
			ScrTnacExample scatnaExample = new ScrTnacExample();
			ScrTxndnInfExample scrTxndnInfExample = new ScrTxndnInfExample();
			SimilarityExample similarityExample = new SimilarityExample();
			Set<String> set = new HashSet<>();
			
			long ct = System.currentTimeMillis();
			List<ScrTnac> userlist = scrTnacMapper.selectByExample(scatnaExample);
			List<ScrTxndnInf> datalist = new ArrayList<>();
			
			List<Similarity> similaritieList = new ArrayList<>();
			List<String> list = new ArrayList<>();
			
			Map<String,Map<String,Integer>> relationmap = new HashMap<>();
			Map<String, Integer> innermap = new HashMap<>();
	        Map<String, Integer> tempinnermap = new HashMap<>();
	        Map<String,Set<String>> map = new HashMap<>();
	        Map<String,Set<String>> fundMap = new HashMap<>();
			
			String SCR_TXN_ACCNO = "";
			String SCR_PD_ECD = "";
			
			scrTxndnInfExample.clear();
			datalist = scrTxndnInfMapper.selectByExample(scrTxndnInfExample);
			for(int i = 0; i < datalist.size(); i++){
				ScrTxndnInf scrTnac = datalist.get(i);
				SCR_TXN_ACCNO = scrTnac.getScrTxnAccno();
				SCR_PD_ECD = scrTnac.getScrPdEcd();
				if(map.containsKey(SCR_TXN_ACCNO)){
					Set<String> s = map.get(SCR_TXN_ACCNO);
					s.add(SCR_PD_ECD);
					map.put(SCR_TXN_ACCNO, s);
				}
				else{
					Set<String> s = new  HashSet<>();
					s.add(SCR_PD_ECD);
					map.put(SCR_TXN_ACCNO, s);
				}
			}
			//System.out.println("耗时:"+ (System.currentTimeMillis() - ct));
			
			
			similarityMapper.deleteByExample(similarityExample);
			for(int i = 0; i < userlist.size(); i++){
				SCR_TXN_ACCNO = userlist.get(i).getScrTxnAccno();
				if(map.containsKey(SCR_TXN_ACCNO)){
					set = map.get(SCR_TXN_ACCNO);
				}
				
				for(String s : set){
					list.add(s);
				}
				
				for(int j = 0; j < list.size(); j++){
	                String firstid = list.get(j);
	                if(!relationmap.containsKey(firstid)){
	                    innermap = new HashMap<String, Integer>();
	                    relationmap.put(firstid, innermap);
	                }
	                tempinnermap = relationmap.get(firstid);
	                for(int k = 0; k <list.size(); k++){
	                    if(j == k) continue;
	                    String secondid = list.get(k);
	                    if (!tempinnermap.containsKey(secondid)) {
	                        tempinnermap.put(secondid, 1);
	                    } else {
	                        int num = tempinnermap.get(secondid) + 1;
	                        tempinnermap.put(secondid, num);
	                    }
	                }
	            }
				list.clear();
			}
			
			scrTxndnInfExample.clear();
			datalist = scrTxndnInfMapper.selectByExample(scrTxndnInfExample);
			for(int i = 0; i < datalist.size(); i++){
				SCR_TXN_ACCNO = datalist.get(i).getScrTxnAccno();
				SCR_PD_ECD = datalist.get(i).getScrPdEcd();
				if(fundMap.containsKey(SCR_PD_ECD)){
					Set<String> s = fundMap.get(SCR_PD_ECD);
					s.add(SCR_TXN_ACCNO);
					fundMap.put(SCR_PD_ECD, s);
				}
				else{
					Set<String> s = new HashSet<>();
					s.add(SCR_TXN_ACCNO);
					fundMap.put(SCR_PD_ECD, s);
				}
			}
			
			
			int listSize = 0;
			for(String fundFirstId : relationmap.keySet()){
				innermap = relationmap.get(fundFirstId);
				for(String fundSecondId : innermap.keySet()){
					double score = (double) innermap.get(fundSecondId);
					int num1 = fundMap.get(fundFirstId).size();
					int num2 = fundMap.get(fundSecondId).size();
					
					score = score / Math.sqrt((double)num1) / Math.sqrt((double)num2) ;
					Similarity similarity = new Similarity();
					similarity.setFundIdFirst(fundFirstId);
					similarity.setFundIdSecond(fundSecondId);
					similarity.setScore(String.valueOf(score));
					similaritieList.add(similarity);
					listSize++;
				    if(listSize == 1000){
				    	similarityMapper.insertList(similaritieList);
				    	similaritieList.clear();
				    	listSize = 0;
				    } 
				}	
			}
			
			if(similaritieList.size() > 0) {
				similarityMapper.insertList(similaritieList);
			}
			
			System.out.println("耗时:"+ (System.currentTimeMillis() - ct));
		}
		
		
	}
}
