package com.vzionsys.ssm.util;
/**
 * 
 * <p>Title: SuccessJson</p>
 * <p>Description: 操作成功返回的json</p>
 * <p>Company: www.vzionsys.com</p> 
 * @author  刘政
 * @date    2015-12-18下午11:03:16
 * @version 1.0
 */
public class SuccessJson {

	private int ret;
	private String message;
	public SuccessJson(int ret, String message) {
		super();
		this.ret = ret;
		this.message = message;
	}
	public int getRet() {
		return ret;
	}
	public void setRet(int ret) {
		this.ret = ret;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	};
	
}
