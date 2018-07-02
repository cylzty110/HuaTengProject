package com.vzionsys.ssm.util;

import java.util.List;

/**
 * 
 * <p>Title: ObjectListCustom</p>
 * <p>Description: json列表对象</p>
 * <p>Company: www.vzionsys.com</p> 
 * @author  刘政
 * @date    2015-12-14下午2:40:58
 * @version 1.0
 */
public class ObjectListCustom {

	private int ret;
	private List objects;
	public ObjectListCustom(int ret, List objects) {
		super();
		this.ret = ret;
		this.objects = objects;
	}
	public int getRet() {
		return ret;
	}
	public void setRet(int ret) {
		this.ret = ret;
	}
	public List<Object> getObjects() {
		return objects;
	}
	public void setObjects(List<Object> objects) {
		this.objects = objects;
	}
	
}
