package com.mkt.service.impl;

import com.mkt.entity.Student;
import com.mkt.entity.TscCcreceiving;
import com.mkt.mysqlmapper.StudentMapper;
import com.mkt.oraclemapper.TscCcreceivingMapper;
import com.mkt.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;
    @Autowired
    private TscCcreceivingMapper tscCcreceivingMapper;

    @Override
    public List<Student> finAll() {
        return studentMapper.finAll();
    }


    @Override
    @Transactional
    public String insert(Student student) {
        Student student1 = new Student();
        student1.setName("事务1");
        int i = studentMapper.insertStudent(student1);
        int a =1/0;
        TscCcreceiving tscCcreceiving = new TscCcreceiving();
        tscCcreceiving.setcId("123456654");
        int i1 = tscCcreceivingMapper.insertTscCcreceiving(tscCcreceiving);
        if(i>0){
            return "success";
        }else{
            return "error";
        }
    }
}
