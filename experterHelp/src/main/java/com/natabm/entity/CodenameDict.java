package com.natabm.entity;

public class CodenameDict {
    private String fieldEnName;

    private String fieldCnName;

    private String fieldValue;

    private String fieldDesc;

    public String getFieldEnName() {
        return fieldEnName;
    }

    public void setFieldEnName(String fieldEnName) {
        this.fieldEnName = fieldEnName == null ? null : fieldEnName.trim();
    }

    public String getFieldCnName() {
        return fieldCnName;
    }

    public void setFieldCnName(String fieldCnName) {
        this.fieldCnName = fieldCnName == null ? null : fieldCnName.trim();
    }

    public String getFieldValue() {
        return fieldValue;
    }

    public void setFieldValue(String fieldValue) {
        this.fieldValue = fieldValue == null ? null : fieldValue.trim();
    }

    public String getFieldDesc() {
        return fieldDesc;
    }

    public void setFieldDesc(String fieldDesc) {
        this.fieldDesc = fieldDesc == null ? null : fieldDesc.trim();
    }
}