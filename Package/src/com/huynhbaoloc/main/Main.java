package com.huynhbaoloc.main;

import com.huynhbaoloc.service.Student;
import com.huynhbaoloc.service.impl.StudentImpl;

public class Main {
    public static void main(String[] args) {
        Student student = new StudentImpl();
        student.insert();
        student.update();
        student.delete();
    }
}
