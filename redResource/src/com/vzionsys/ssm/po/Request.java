package com.vzionsys.ssm.po;

public class Request {
	private String uploadBatch;
	public String getUploadBatch() {
		return uploadBatch;
	}
	public void setUploadBatch(String uploadBatch) {
		this.uploadBatch = uploadBatch;
	}
	public String getTableName() {
		return tableName;
	}
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	public String getTaskBatch() {
		return taskBatch;
	}
	public void setTaskBatch(String taskBatch) {
		this.taskBatch = taskBatch;
	}
	public String getScrPdEcd() {
		return scrPdEcd;
	}
	public void setScrPdEcd(String scrPdEcd) {
		this.scrPdEcd = scrPdEcd;
	}
	private String tableName;
	private String taskBatch;
	private String scrPdEcd;
}
