package com.vzionsys.ssm.po;

import java.util.Date;

public class TsTaskInfo {
    private Integer taskId;

    private String taskTableMsg;

    private String taskTableBatchMsg;

    private String taskReturnMessage;

    private String taskDate;

    private String taskReturnDate;

    private String taskBatch;

    private String createUserId;

    private Date createDate;

    private String taskStatus;

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public String getTaskTableMsg() {
        return taskTableMsg;
    }

    public void setTaskTableMsg(String taskTableMsg) {
        this.taskTableMsg = taskTableMsg;
    }

    public String getTaskTableBatchMsg() {
        return taskTableBatchMsg;
    }

    public void setTaskTableBatchMsg(String taskTableBatchMsg) {
        this.taskTableBatchMsg = taskTableBatchMsg;
    }

    public String getTaskReturnMessage() {
        return taskReturnMessage;
    }

    public void setTaskReturnMessage(String taskReturnMessage) {
        this.taskReturnMessage = taskReturnMessage;
    }

    public String getTaskDate() {
        return taskDate;
    }

    public void setTaskDate(String taskDate) {
        this.taskDate = taskDate;
    }

    public String getTaskReturnDate() {
        return taskReturnDate;
    }

    public void setTaskReturnDate(String taskReturnDate) {
        this.taskReturnDate = taskReturnDate;
    }

    public String getTaskBatch() {
        return taskBatch;
    }

    public void setTaskBatch(String taskBatch) {
        this.taskBatch = taskBatch;
    }

    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }
}