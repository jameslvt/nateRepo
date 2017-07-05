package com.natabm.entity;

public class ProductInfo {
    private String productId;

    private String productType;

    private String productName;

    private String productPrice;

    private String productUnbits;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId == null ? null : productId.trim();
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType == null ? null : productType.trim();
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice == null ? null : productPrice.trim();
    }

    public String getProductUnbits() {
        return productUnbits;
    }

    public void setProductUnbits(String productUnbits) {
        this.productUnbits = productUnbits == null ? null : productUnbits.trim();
    }
}