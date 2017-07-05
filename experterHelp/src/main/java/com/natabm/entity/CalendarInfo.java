package com.natabm.entity;

import java.util.Date;

public class CalendarInfo {
    private String serialId;

    private String expSerialId;

    private Date startTime;

    private Date endTime;

    private Date operTime;

    private String operFlag;

    public String getSerialId() {
        return serialId;
    }

    public void setSerialId(String serialId) {
        this.serialId = serialId == null ? null : serialId.trim();
    }

    public String getExpSerialId() {
        return expSerialId;
    }

    public void setExpSerialId(String expSerialId) {
        this.expSerialId = expSerialId == null ? null : expSerialId.trim();
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getOperTime() {
        return operTime;
    }

    public void setOperTime(Date operTime) {
        this.operTime = operTime;
    }

    public String getOperFlag() {
        return operFlag;
    }

    public void setOperFlag(String operFlag) {
        this.operFlag = operFlag == null ? null : operFlag.trim();
    }
}