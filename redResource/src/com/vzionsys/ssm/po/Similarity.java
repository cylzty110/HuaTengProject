package com.vzionsys.ssm.po;

public class Similarity {
    private Integer id;

    private String fundIdFirst;

    private String fundIdSecond;

    private String score;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFundIdFirst() {
        return fundIdFirst;
    }

    public void setFundIdFirst(String fundIdFirst) {
        this.fundIdFirst = fundIdFirst;
    }

    public String getFundIdSecond() {
        return fundIdSecond;
    }

    public void setFundIdSecond(String fundIdSecond) {
        this.fundIdSecond = fundIdSecond;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }
}