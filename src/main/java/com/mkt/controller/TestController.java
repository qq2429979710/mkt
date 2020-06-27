package com.mkt.controller;

import com.mkt.entity.Student;
import com.mkt.entity.TscCcreceiving;
import com.mkt.service.StudentService;
import com.mkt.service.TscCcreceivingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/testController")
public class TestController {
    @Autowired
    private TscCcreceivingService tscCcreceivingServiceImpl;

    @Autowired
    private StudentService studentServiceImpl;

    @RequestMapping("/test")
    public TscCcreceiving test(String cId){
        TscCcreceiving tscCcreceiving = tscCcreceivingServiceImpl.selectByPrimaryKey(cId);
        return tscCcreceiving;
    }
    @RequestMapping("/finAll")
    public List<Student> finAll(){
        List<Student> students = studentServiceImpl.finAll();
        return students;
    }

    @RequestMapping("/insertStudent")
    public String insertStudent(Student student){
        return studentServiceImpl.insert(student);
    }
    @RequestMapping("/insertTscCcreceiving")
    public String insertTscCcreceiving(TscCcreceiving tscCcreceiving){
        return tscCcreceivingServiceImpl.insert(tscCcreceiving);
    }

}
