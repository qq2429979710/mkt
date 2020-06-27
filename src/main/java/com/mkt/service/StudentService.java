package com.mkt.service;

import com.mkt.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> finAll();

    String  insert(Student student);
}
