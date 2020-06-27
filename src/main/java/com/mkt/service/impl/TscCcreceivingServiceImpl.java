package com.mkt.service.impl;

import com.mkt.entity.TscCcreceiving;
import com.mkt.oraclemapper.TscCcreceivingMapper;
import com.mkt.service.TscCcreceivingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class TscCcreceivingServiceImpl implements TscCcreceivingService {

    @Autowired
    private TscCcreceivingMapper tscCcreceivingMapper;

    @Override
    public TscCcreceiving selectByPrimaryKey(String cId) {
        TscCcreceiving tscCcreceiving = tscCcreceivingMapper.selectByPrimaryKey(cId);
        return tscCcreceiving;
    }

    @Override
    public String insert(TscCcreceiving tscCcreceiving) {
        int i = tscCcreceivingMapper.insertTscCcreceiving(tscCcreceiving);
        if(i>0){
            return "success";
        }else{
            return "error";
        }
    }
}
