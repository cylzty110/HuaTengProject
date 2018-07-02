package com.vzionsys.ssm.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

/**
 * 
 * <p>Title: CustomExceptionResolver</p>
 * <p>Description: 全局异常处理器</p>
 * <p>Company: www.vzionsys.com</p> 
 * @author  刘政
 * @date    2015-12-17下午1:58:18
 * @version 1.0
 */
public class CustomExceptionResolver implements HandlerExceptionResolver{

	@Override
	public @ResponseBody ModelAndView resolveException(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex) {

		//ex.printStackTrace();

		CustomException customException = null;
		
		//如果抛出的是系统自定义异常则直接转换
		if(ex instanceof CustomException){
			customException = (CustomException)ex;
		}else{
			//如果抛出的不是系统自定义异常则重新构造一个未知错误异常。
			customException = new CustomException(50001,"未知错误，请与系统管理 员联系！");
		}
		StringBuilder builder = new StringBuilder();
		builder.append('{');
		builder.append("\"ret\":").append(customException.getErrorCode());
		builder.append(',');
		builder.append("\"message\":").append("\""+customException.getMessage()+"\"");
		builder.append('}');
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("error", builder.toString());
		modelAndView.setViewName("error");

		return modelAndView;
	}

}
