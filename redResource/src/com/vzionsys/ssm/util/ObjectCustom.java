package com.vzionsys.ssm.util;

public class ObjectCustom {

	private int ret;
	private Object object;
	public ObjectCustom(int ret, Object object) {
		super();
		this.ret = ret;
		this.object = object;
	}
	public int getRet() {
		return ret;
	}
	public void setRet(int ret) {
		this.ret = ret;
	}
	public Object getObject() {
		return object;
	}
	public void setObject(Object object) {
		this.object = object;
	}
	
}
