package com.natabm.entity;

import java.util.Date;

public class ExhibitionInfo {
    private String serialId;

    private String exhibitionAddress;

    private String exhibitionProtity;

    private String exhibitionPrice;

    private String exhibitionType;

    private Date startTime;

    private Date endTime;

    public String getSerialId() {
        return serialId;
    }

    public void setSerialId(String serialId) {
        this.serialId = serialId == null ? null : serialId.trim();
    }

    public String getExhibitionAddress() {
        return exhibitionAddress;
    }

    public void setExhibitionAddress(String exhibitionAddress) {
        this.exhibitionAddress = exhibitionAddress == null ? null : exhibitionAddress.trim();
    }

    public String getExhibitionProtity() {
        return exhibitionProtity;
    }

    public void setExhibitionProtity(String exhibitionProtity) {
        this.exhibitionProtity = exhibitionProtity == null ? null : exhibitionProtity.trim();
    }

    public String getExhibitionPrice() {
        return exhibitionPrice;
    }

    public void setExhibitionPrice(String exhibitionPrice) {
        this.exhibitionPrice = exhibitionPrice == null ? null : exhibitionPrice.trim();
    }

    public String getExhibitionType() {
        return exhibitionType;
    }

    public void setExhibitionType(String exhibitionType) {
        this.exhibitionType = exhibitionType == null ? null : exhibitionType.trim();
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
}