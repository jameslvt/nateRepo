package com.natabm.entity;

public class Test {
    private String test1;

    private String test2;

    public String getTest1() {
        return test1;
    }

    public void setTest1(String test1) {
        this.test1 = test1 == null ? null : test1.trim();
    }

    public String getTest2() {
        return test2;
    }

    public void setTest2(String test2) {
        this.test2 = test2 == null ? null : test2.trim();
    }
}