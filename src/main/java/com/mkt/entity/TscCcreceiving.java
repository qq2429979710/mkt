
package com.mkt.entity;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class TscCcreceiving implements java.io.Serializable {
	//field
	/** 主键 **/
	private String cId;
	/** 工厂 **/
	private String cPlant;
	/** 工位 **/
	private String cStaid;
	/** 工位描述 **/
	private String cStadesc;
	/** 连铸壁 **/
	private String cPew;
	/** 炉号 **/
	private String cStove;
	/** 炉次号 **/
	private String cStovemainid;
	/** 浇次id **/
	private String cPlancastid;
	/** 通知单号 **/
	private String cNoticeid;
	/** 执行标准 **/
	private String cStdspec;
	/** 钢种 **/
	private String cStlgrd;
	/** 规格 **/
	private String cSpec;
	/** 定尺 **/
	private String cLth;
	/** 是否自开 **/
	private String cIsopen;
	/** 班组 **/
	private String cGroup;
	/** 班次 **/
	private String cShift;
	/** 当班炉数 **/
	private Long nStovenum;
	/** 炉次状态WPSF **/
	private String cStovestate;
	/** 进站时间 **/
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date dStovedatein;
	/** 开浇开始时间 **/
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date dStovedates;
	/** 停浇结束时间 **/
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date dStovedatee;
	/** 浇注时间 **/
	private String dStovetime;
	/** 开浇重量 **/
	private Double dWeightgross;
	/** 停浇重量 **/
	private Double dWeighttare;
	/** 净重 **/
	private BigDecimal dWeightnet;
	/** 炉次投料状态 N Y **/
	private String cFeedstate;
	/** 炉次工参状态 N Y **/
	private String cParamstate;
	/** 进站温度 **/
	private String cTempin;
	/** 出站温度 **/
	private String cTempout;
	/** 记账日期 YYYY-MM-DD **/
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	private Date cAccdate;
	/** 连铸机号 **/
	private String cStationcc;
	/** 备注 **/
	private String cRemark;
	/** 录入人 **/
	private String cCrtemper;
	/** 录入时间 **/
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date cCrttime;
	/** 修改人 **/
	private String cModifier;
	/** 修改时间 **/
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date cModifytime;
	/** 时间戳 **/
	private Date cTimestamp;
	/** 删除标识 **/
	private String cDr;
	/** 创建人 **/
	private String cCreater;
	/** 创建时间 **/
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date cCreatetime;
	/** 状态 **/
	private String cState;
	/** 扩展字段1 **/
	private String cSw01;
	/** 扩展字段2 **/
	private String cSw02;
	/** 扩展字段3 **/
	private String cSw03;
	/** 扩展字段4 **/
	private String cSw04;
	/** 扩展字段5 **/
	private String cSw05;
	/** 扩展字段6 **/
	private String cSw06;
	/** 扩展字段7 **/
	private String cSw07;
	/** 扩展字段8 **/
	private String cSw08;
	/** 扩展字段9 **/
	private String cSw09;
	/** 扩展字段10 **/
	private String cSw10;
	/** 扩展字段11 **/
	private String cSw11;
	/** 扩展字段12 **/
	private String cSw12;
	/** 扩展字段13 **/
	private String cSw13;
	/** 扩展字段14 **/
	private String cSw14;
	/** 扩展字段15 **/
	private String cSw15;
	/** 中包号 **/
	private String cToolId;
	/** 中包年龄 **/
	private String cToolage;
	/** 中包浇次号 **/
	private String cToolcastid;
	/** 中包开浇时间 **/
	private Date cToolstarttime;
	/** 中包停浇时间 **/
	private Date cToolendtime;
	/**计划关包米**/
	private BigDecimal cPlantgb;
	//用途码
	private String  cBehoof;
	//浇筑顺序
	private String cCastingOrder;
	//结晶器id
	private String cJjqid;

	// 断面
	private String cSection;
	//method

	public String getcId() {
		return cId;
	}

	public void setcId(String cId) {
		this.cId = cId;
	}

	public String getcPlant() {
		return cPlant;
	}

	public void setcPlant(String cPlant) {
		this.cPlant = cPlant;
	}

	public String getcStaid() {
		return cStaid;
	}

	public void setcStaid(String cStaid) {
		this.cStaid = cStaid;
	}

	public String getcStadesc() {
		return cStadesc;
	}

	public void setcStadesc(String cStadesc) {
		this.cStadesc = cStadesc;
	}

	public String getcPew() {
		return cPew;
	}

	public void setcPew(String cPew) {
		this.cPew = cPew;
	}

	public String getcStove() {
		return cStove;
	}

	public void setcStove(String cStove) {
		this.cStove = cStove;
	}

	public String getcStovemainid() {
		return cStovemainid;
	}

	public void setcStovemainid(String cStovemainid) {
		this.cStovemainid = cStovemainid;
	}

	public String getcPlancastid() {
		return cPlancastid;
	}

	public void setcPlancastid(String cPlancastid) {
		this.cPlancastid = cPlancastid;
	}

	public String getcNoticeid() {
		return cNoticeid;
	}

	public void setcNoticeid(String cNoticeid) {
		this.cNoticeid = cNoticeid;
	}

	public String getcStdspec() {
		return cStdspec;
	}

	public void setcStdspec(String cStdspec) {
		this.cStdspec = cStdspec;
	}

	public String getcStlgrd() {
		return cStlgrd;
	}

	public void setcStlgrd(String cStlgrd) {
		this.cStlgrd = cStlgrd;
	}

	public String getcSpec() {
		return cSpec;
	}

	public void setcSpec(String cSpec) {
		this.cSpec = cSpec;
	}

	public String getcLth() {
		return cLth;
	}

	public void setcLth(String cLth) {
		this.cLth = cLth;
	}

	public String getcIsopen() {
		return cIsopen;
	}

	public void setcIsopen(String cIsopen) {
		this.cIsopen = cIsopen;
	}

	public String getcGroup() {
		return cGroup;
	}

	public void setcGroup(String cGroup) {
		this.cGroup = cGroup;
	}

	public String getcShift() {
		return cShift;
	}

	public void setcShift(String cShift) {
		this.cShift = cShift;
	}

	public Long getnStovenum() {
		return nStovenum;
	}

	public void setnStovenum(Long nStovenum) {
		this.nStovenum = nStovenum;
	}

	public String getcStovestate() {
		return cStovestate;
	}

	public void setcStovestate(String cStovestate) {
		this.cStovestate = cStovestate;
	}

	public Date getdStovedatein() {
		return dStovedatein;
	}

	public void setdStovedatein(Date dStovedatein) {
		this.dStovedatein = dStovedatein;
	}

	public Date getdStovedates() {
		return dStovedates;
	}

	public void setdStovedates(Date dStovedates) {
		this.dStovedates = dStovedates;
	}

	public Date getdStovedatee() {
		return dStovedatee;
	}

	public void setdStovedatee(Date dStovedatee) {
		this.dStovedatee = dStovedatee;
	}

	public String getdStovetime() {
		return dStovetime;
	}

	public void setdStovetime(String dStovetime) {
		this.dStovetime = dStovetime;
	}

	public Double getdWeightgross() {
		return dWeightgross;
	}

	public void setdWeightgross(Double dWeightgross) {
		this.dWeightgross = dWeightgross;
	}

	public Double getdWeighttare() {
		return dWeighttare;
	}

	public void setdWeighttare(Double dWeighttare) {
		this.dWeighttare = dWeighttare;
	}

	public BigDecimal getdWeightnet() {
		return dWeightnet;
	}

	public void setdWeightnet(BigDecimal dWeightnet) {
		this.dWeightnet = dWeightnet;
	}

	public String getcFeedstate() {
		return cFeedstate;
	}

	public void setcFeedstate(String cFeedstate) {
		this.cFeedstate = cFeedstate;
	}

	public String getcParamstate() {
		return cParamstate;
	}

	public void setcParamstate(String cParamstate) {
		this.cParamstate = cParamstate;
	}

	public String getcTempin() {
		return cTempin;
	}

	public void setcTempin(String cTempin) {
		this.cTempin = cTempin;
	}

	public String getcTempout() {
		return cTempout;
	}

	public void setcTempout(String cTempout) {
		this.cTempout = cTempout;
	}

	public Date getcAccdate() {
		return cAccdate;
	}

	public void setcAccdate(Date cAccdate) {
		this.cAccdate = cAccdate;
	}

	public String getcStationcc() {
		return cStationcc;
	}

	public void setcStationcc(String cStationcc) {
		this.cStationcc = cStationcc;
	}

	public String getcRemark() {
		return cRemark;
	}

	public void setcRemark(String cRemark) {
		this.cRemark = cRemark;
	}

	public String getcCrtemper() {
		return cCrtemper;
	}

	public void setcCrtemper(String cCrtemper) {
		this.cCrtemper = cCrtemper;
	}

	public Date getcCrttime() {
		return cCrttime;
	}

	public void setcCrttime(Date cCrttime) {
		this.cCrttime = cCrttime;
	}

	public String getcModifier() {
		return cModifier;
	}

	public void setcModifier(String cModifier) {
		this.cModifier = cModifier;
	}

	public Date getcModifytime() {
		return cModifytime;
	}

	public void setcModifytime(Date cModifytime) {
		this.cModifytime = cModifytime;
	}

	public Date getcTimestamp() {
		return cTimestamp;
	}

	public void setcTimestamp(Date cTimestamp) {
		this.cTimestamp = cTimestamp;
	}

	public String getcDr() {
		return cDr;
	}

	public void setcDr(String cDr) {
		this.cDr = cDr;
	}

	public String getcCreater() {
		return cCreater;
	}

	public void setcCreater(String cCreater) {
		this.cCreater = cCreater;
	}

	public Date getcCreatetime() {
		return cCreatetime;
	}

	public void setcCreatetime(Date cCreatetime) {
		this.cCreatetime = cCreatetime;
	}

	public String getcState() {
		return cState;
	}

	public void setcState(String cState) {
		this.cState = cState;
	}

	public String getcSw01() {
		return cSw01;
	}

	public void setcSw01(String cSw01) {
		this.cSw01 = cSw01;
	}

	public String getcSw02() {
		return cSw02;
	}

	public void setcSw02(String cSw02) {
		this.cSw02 = cSw02;
	}

	public String getcSw03() {
		return cSw03;
	}

	public void setcSw03(String cSw03) {
		this.cSw03 = cSw03;
	}

	public String getcSw04() {
		return cSw04;
	}

	public void setcSw04(String cSw04) {
		this.cSw04 = cSw04;
	}

	public String getcSw05() {
		return cSw05;
	}

	public void setcSw05(String cSw05) {
		this.cSw05 = cSw05;
	}

	public String getcSw06() {
		return cSw06;
	}

	public void setcSw06(String cSw06) {
		this.cSw06 = cSw06;
	}

	public String getcSw07() {
		return cSw07;
	}

	public void setcSw07(String cSw07) {
		this.cSw07 = cSw07;
	}

	public String getcSw08() {
		return cSw08;
	}

	public void setcSw08(String cSw08) {
		this.cSw08 = cSw08;
	}

	public String getcSw09() {
		return cSw09;
	}

	public void setcSw09(String cSw09) {
		this.cSw09 = cSw09;
	}

	public String getcSw10() {
		return cSw10;
	}

	public void setcSw10(String cSw10) {
		this.cSw10 = cSw10;
	}

	public String getcSw11() {
		return cSw11;
	}

	public void setcSw11(String cSw11) {
		this.cSw11 = cSw11;
	}

	public String getcSw12() {
		return cSw12;
	}

	public void setcSw12(String cSw12) {
		this.cSw12 = cSw12;
	}

	public String getcSw13() {
		return cSw13;
	}

	public void setcSw13(String cSw13) {
		this.cSw13 = cSw13;
	}

	public String getcSw14() {
		return cSw14;
	}

	public void setcSw14(String cSw14) {
		this.cSw14 = cSw14;
	}

	public String getcSw15() {
		return cSw15;
	}

	public void setcSw15(String cSw15) {
		this.cSw15 = cSw15;
	}

	public String getcToolId() {
		return cToolId;
	}

	public void setcToolId(String cToolId) {
		this.cToolId = cToolId;
	}

	public String getcToolage() {
		return cToolage;
	}

	public void setcToolage(String cToolage) {
		this.cToolage = cToolage;
	}

	public String getcToolcastid() {
		return cToolcastid;
	}

	public void setcToolcastid(String cToolcastid) {
		this.cToolcastid = cToolcastid;
	}

	public Date getcToolstarttime() {
		return cToolstarttime;
	}

	public void setcToolstarttime(Date cToolstarttime) {
		this.cToolstarttime = cToolstarttime;
	}

	public Date getcToolendtime() {
		return cToolendtime;
	}

	public void setcToolendtime(Date cToolendtime) {
		this.cToolendtime = cToolendtime;
	}

	public BigDecimal getcPlantgb() {
		return cPlantgb;
	}

	public void setcPlantgb(BigDecimal cPlantgb) {
		this.cPlantgb = cPlantgb;
	}

	public String getcBehoof() {
		return cBehoof;
	}

	public void setcBehoof(String cBehoof) {
		this.cBehoof = cBehoof;
	}

	public String getcCastingOrder() {
		return cCastingOrder;
	}

	public void setcCastingOrder(String cCastingOrder) {
		this.cCastingOrder = cCastingOrder;
	}

	public String getcJjqid() {
		return cJjqid;
	}

	public void setcJjqid(String cJjqid) {
		this.cJjqid = cJjqid;
	}

	public String getcSection() {
		return cSection;
	}

	public void setcSection(String cSection) {
		this.cSection = cSection;
	}

	@Override
	public String toString() {
		return "TscCcreceiving{" +
				"cId='" + cId + '\'' +
				", cPlant='" + cPlant + '\'' +
				", cStaid='" + cStaid + '\'' +
				", cStadesc='" + cStadesc + '\'' +
				", cPew='" + cPew + '\'' +
				", cStove='" + cStove + '\'' +
				", cStovemainid='" + cStovemainid + '\'' +
				", cPlancastid='" + cPlancastid + '\'' +
				", cNoticeid='" + cNoticeid + '\'' +
				", cStdspec='" + cStdspec + '\'' +
				", cStlgrd='" + cStlgrd + '\'' +
				", cSpec='" + cSpec + '\'' +
				", cLth='" + cLth + '\'' +
				", cIsopen='" + cIsopen + '\'' +
				", cGroup='" + cGroup + '\'' +
				", cShift='" + cShift + '\'' +
				", nStovenum=" + nStovenum +
				", cStovestate='" + cStovestate + '\'' +
				", dStovedatein=" + dStovedatein +
				", dStovedates=" + dStovedates +
				", dStovedatee=" + dStovedatee +
				", dStovetime='" + dStovetime + '\'' +
				", dWeightgross=" + dWeightgross +
				", dWeighttare=" + dWeighttare +
				", dWeightnet=" + dWeightnet +
				", cFeedstate='" + cFeedstate + '\'' +
				", cParamstate='" + cParamstate + '\'' +
				", cTempin='" + cTempin + '\'' +
				", cTempout='" + cTempout + '\'' +
				", cAccdate=" + cAccdate +
				", cStationcc='" + cStationcc + '\'' +
				", cRemark='" + cRemark + '\'' +
				", cCrtemper='" + cCrtemper + '\'' +
				", cCrttime=" + cCrttime +
				", cModifier='" + cModifier + '\'' +
				", cModifytime=" + cModifytime +
				", cTimestamp=" + cTimestamp +
				", cDr='" + cDr + '\'' +
				", cCreater='" + cCreater + '\'' +
				", cCreatetime=" + cCreatetime +
				", cState='" + cState + '\'' +
				", cSw01='" + cSw01 + '\'' +
				", cSw02='" + cSw02 + '\'' +
				", cSw03='" + cSw03 + '\'' +
				", cSw04='" + cSw04 + '\'' +
				", cSw05='" + cSw05 + '\'' +
				", cSw06='" + cSw06 + '\'' +
				", cSw07='" + cSw07 + '\'' +
				", cSw08='" + cSw08 + '\'' +
				", cSw09='" + cSw09 + '\'' +
				", cSw10='" + cSw10 + '\'' +
				", cSw11='" + cSw11 + '\'' +
				", cSw12='" + cSw12 + '\'' +
				", cSw13='" + cSw13 + '\'' +
				", cSw14='" + cSw14 + '\'' +
				", cSw15='" + cSw15 + '\'' +
				", cToolId='" + cToolId + '\'' +
				", cToolage='" + cToolage + '\'' +
				", cToolcastid='" + cToolcastid + '\'' +
				", cToolstarttime=" + cToolstarttime +
				", cToolendtime=" + cToolendtime +
				", cPlantgb=" + cPlantgb +
				", cBehoof='" + cBehoof + '\'' +
				", cCastingOrder='" + cCastingOrder + '\'' +
				", cJjqid='" + cJjqid + '\'' +
				", cSection='" + cSection + '\'' +
				'}';
	}
}
