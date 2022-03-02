package com.lening.entity;

import java.util.Date;

public class TraineeBean {
    private Integer tId;

    private String tName;

    private String tSex;

    private Integer tAge;

    private Date tIndate;

    public Integer gettId() {
        return tId;
    }

    public void settId(Integer tId) {
        this.tId = tId;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName == null ? null : tName.trim();
    }

    public String gettSex() {
        return tSex;
    }

    public void settSex(String tSex) {
        this.tSex = tSex == null ? null : tSex.trim();
    }

    public Integer gettAge() {
        return tAge;
    }

    public void settAge(Integer tAge) {
        this.tAge = tAge;
    }

    public Date gettIndate() {
        return tIndate;
    }

    public void settIndate(Date tIndate) {
        this.tIndate = tIndate;
    }
}