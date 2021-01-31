package com.huynhbaoloc;

public class Student extends  Person{
    private String major;
    public Student(String name, int age, String address, String major) {
        super(name, age, address);
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
