package com.vzionsys.ssm.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.scienjus.authorization.annotation.Authorization;
import com.vzionsys.ssm.po.Request;
import com.vzionsys.ssm.service.SqlService;

@Authorization
@Controller
public class CategoryController {
	@Autowired
	
	private SqlService scrTnacSqlService;
	
	@RequestMapping(value = "/model/predictByNum", method = RequestMethod.POST)
	public @ResponseBody
	String recommendClass(@RequestBody List<Request> requestList) throws Exception {
		Request item1 = requestList.get(0);
		Request item2 = requestList.get(1);
		String message;
		message = scrTnacSqlService.selectByExample(item1.getScrPdEcd(),item1.getUploadBatch(),item2.getUploadBatch(),item1.getTaskBatch());
		return message;
	}
}




