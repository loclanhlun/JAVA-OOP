package com.huynhbaoloc;

public class Engineer extends Person{
    private String job;

    public Engineer(String name, int age, String address, String job) {
        super(name, age, address);
        this.job = job;
    }


    public String getMajor() {
        return job;
    }

    public void setMajor(String major) {
        this.job = job;
    }


}
