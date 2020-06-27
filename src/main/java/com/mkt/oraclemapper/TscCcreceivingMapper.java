package com.mkt.oraclemapper;

import com.mkt.entity.TscCcreceiving;
import org.apache.ibatis.annotations.Param;

public interface TscCcreceivingMapper {

	TscCcreceiving selectByPrimaryKey(@Param("cId") String cId);

	int insertTscCcreceiving(TscCcreceiving tscCcreceiving);
}
