package com.mkt.mysqlmapper;

import com.mkt.entity.Student;

import java.util.List;

/*
 *   @author 孟开通
 *   @date   2020/6/27 - 1:46
 */
public interface StudentMapper {

    List<Student> finAll();

    int insertStudent(Student student);
}
