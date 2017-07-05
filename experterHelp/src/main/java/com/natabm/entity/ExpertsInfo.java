package com.natabm.entity;

public class ExpertsInfo {
    private String serialId;

    private String firstType;

    private String secondType;

    private String thirdType;

    private String expertName;

    private String expertNatural;

    private String expertFee;

    private String phoneNo;

    public String getSerialId() {
        return serialId;
    }

    public void setSerialId(String serialId) {
        this.serialId = serialId == null ? null : serialId.trim();
    }

    public String getFirstType() {
        return firstType;
    }

    public void setFirstType(String firstType) {
        this.firstType = firstType == null ? null : firstType.trim();
    }

    public String getSecondType() {
        return secondType;
    }

    public void setSecondType(String secondType) {
        this.secondType = secondType == null ? null : secondType.trim();
    }

    public String getThirdType() {
        return thirdType;
    }

    public void setThirdType(String thirdType) {
        this.thirdType = thirdType == null ? null : thirdType.trim();
    }

    public String getExpertName() {
        return expertName;
    }

    public void setExpertName(String expertName) {
        this.expertName = expertName == null ? null : expertName.trim();
    }

    public String getExpertNatural() {
        return expertNatural;
    }

    public void setExpertNatural(String expertNatural) {
        this.expertNatural = expertNatural == null ? null : expertNatural.trim();
    }

    public String getExpertFee() {
        return expertFee;
    }

    public void setExpertFee(String expertFee) {
        this.expertFee = expertFee == null ? null : expertFee.trim();
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo == null ? null : phoneNo.trim();
    }
}