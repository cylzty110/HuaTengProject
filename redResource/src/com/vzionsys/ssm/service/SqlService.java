package com.vzionsys.ssm.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestParam;

import com.vzionsys.ssm.po.ScrTnac;
import com.vzionsys.ssm.po.ScrTnacExample;

public interface SqlService {
	String selectByExample(String fundNum,String tnacUploadBatch,String txndnUploadBatch ,String taskBatch);
}
