package com.vzionsys.ssm.po;

public class ScrTnac {
    private Integer id;

    private String scrTxnAccno;

    private String cstId;

    private String uploadTime;

    private String uploadUser;

    private String uploadBatch;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getScrTxnAccno() {
        return scrTxnAccno;
    }

    public void setScrTxnAccno(String scrTxnAccno) {
        this.scrTxnAccno = scrTxnAccno;
    }

    public String getCstId() {
        return cstId;
    }

    public void setCstId(String cstId) {
        this.cstId = cstId;
    }

    public String getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(String uploadTime) {
        this.uploadTime = uploadTime;
    }

    public String getUploadUser() {
        return uploadUser;
    }

    public void setUploadUser(String uploadUser) {
        this.uploadUser = uploadUser;
    }

    public String getUploadBatch() {
        return uploadBatch;
    }

    public void setUploadBatch(String uploadBatch) {
        this.uploadBatch = uploadBatch;
    }
}