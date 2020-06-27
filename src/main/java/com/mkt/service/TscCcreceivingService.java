package com.mkt.service;

import com.mkt.entity.Student;
import com.mkt.entity.TscCcreceiving;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

public interface TscCcreceivingService {

	TscCcreceiving selectByPrimaryKey(String cId);

	String  insert(TscCcreceiving tscCcreceiving);
}
