package com.natabm.entity;

public class PreferentialInfo {
    private String serialId;

    private String memberType;

    private String standDis;

    private String expertDis;

    private String productDis;

    public String getSerialId() {
        return serialId;
    }

    public void setSerialId(String serialId) {
        this.serialId = serialId == null ? null : serialId.trim();
    }

    public String getMemberType() {
        return memberType;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType == null ? null : memberType.trim();
    }

    public String getStandDis() {
        return standDis;
    }

    public void setStandDis(String standDis) {
        this.standDis = standDis == null ? null : standDis.trim();
    }

    public String getExpertDis() {
        return expertDis;
    }

    public void setExpertDis(String expertDis) {
        this.expertDis = expertDis == null ? null : expertDis.trim();
    }

    public String getProductDis() {
        return productDis;
    }

    public void setProductDis(String productDis) {
        this.productDis = productDis == null ? null : productDis.trim();
    }
}