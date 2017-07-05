package com.natabm.entity;

public class SaleInfo {
    private String serialId;

    private String saleType;

    private String salePrice;

    private String saleUnits;

    private String saleNum;

    public String getSerialId() {
        return serialId;
    }

    public void setSerialId(String serialId) {
        this.serialId = serialId == null ? null : serialId.trim();
    }

    public String getSaleType() {
        return saleType;
    }

    public void setSaleType(String saleType) {
        this.saleType = saleType == null ? null : saleType.trim();
    }

    public String getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(String salePrice) {
        this.salePrice = salePrice == null ? null : salePrice.trim();
    }

    public String getSaleUnits() {
        return saleUnits;
    }

    public void setSaleUnits(String saleUnits) {
        this.saleUnits = saleUnits == null ? null : saleUnits.trim();
    }

    public String getSaleNum() {
        return saleNum;
    }

    public void setSaleNum(String saleNum) {
        this.saleNum = saleNum == null ? null : saleNum.trim();
    }
}