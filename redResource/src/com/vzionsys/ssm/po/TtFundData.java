package com.vzionsys.ssm.po;

import java.util.Date;

public class TtFundData {
    private Integer id;

    private String userid;

    private String probility;

    private String taskBatch;

    private Date createDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getProbility() {
        return probility;
    }

    public void setProbility(String probility) {
        this.probility = probility;
    }

    public String getTaskBatch() {
        return taskBatch;
    }

    public void setTaskBatch(String taskBatch) {
        this.taskBatch = taskBatch;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}