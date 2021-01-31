package com.huynhbaoloc.service.impl;

import com.huynhbaoloc.service.Student;

public class StudentImpl implements Student {

    @Override
    public void insert() {
        System.out.println("insert method");
    }

    @Override
    public void update() {
        System.out.println("update method");
    }

    @Override
    public void delete() {
        System.out.println("delete method");
    }
}
