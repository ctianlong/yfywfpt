package com.newtouch.yfy.api;


import com.newtouch.lion.model.BaseEntity;

public class AppoResources extends BaseEntity<String> {

	/**
	 *  
	 */
	private static final long serialVersionUID = 8559895731150822004L;
	private String id;
	private String appoid;
	private String hospitalcode;
	private String hospitalname;
	private String appotemplateid; // '预约资源模板id(说明：具体的资源模板id，具体到某天上下午的某个时间段。)',
	private String appocode;
	private String dept1code;
	private String dept1name;
	private String dept2code;
	private String dept2name;
	private String doctid;
	private String doctcode;
	private String doctname;
	private String expertdegree;
	private String cancelled; // '0:停诊1没停诊\r\n 停诊只是说明出诊当日停诊，如果停诊要发停诊通知给已预约病人.',
	private String canceltime;
	private String registertype;
	private String appodate;
	private String appostarttime; // '预约模板中的开始时间',
	private String appoendtime; // '预约模板中的结束时间',
	private String appoperiod; // '显示此项目时间段是0上午、1下午、2全天',
	private String resnumber;
	private String surplusnum;
	private String registerfee;
	private String syncdate;
	private String modifydate;
	private String deletedate;
	
	public String getAppoid() {
		return appoid;
	}

	public void setAppoid(String appoid) {
		this.appoid = appoid;
	}

	public String getHospitalcode() {
		return hospitalcode;
	}

	public void setHospitalcode(String hospitalcode) {
		this.hospitalcode = hospitalcode;
	}

	public String getHospitalname() {
		return hospitalname;
	}

	public void setHospitalname(String hospitalname) {
		this.hospitalname = hospitalname;
	}

	public String getAppotemplateid() {
		return appotemplateid;
	}

	public void setAppotemplateid(String appotemplateid) {
		this.appotemplateid = appotemplateid;
	}

	public String getAppocode() {
		return appocode;
	}

	public void setAppocode(String appocode) {
		this.appocode = appocode;
	}

	public String getDept1code() {
		return dept1code;
	}

	public void setDept1code(String dept1code) {
		this.dept1code = dept1code;
	}

	public String getDept1name() {
		return dept1name;
	}

	public void setDept1name(String dept1name) {
		this.dept1name = dept1name;
	}

	public String getDept2code() {
		return dept2code;
	}

	public void setDept2code(String dept2code) {
		this.dept2code = dept2code;
	}

	public String getDept2name() {
		return dept2name;
	}

	public void setDept2name(String dept2name) {
		this.dept2name = dept2name;
	}

	public String getDoctid() {
		return doctid;
	}

	public void setDoctid(String doctid) {
		this.doctid = doctid;
	}

	public String getDoctcode() {
		return doctcode;
	}

	public void setDoctcode(String doctcode) {
		this.doctcode = doctcode;
	}

	public String getDoctname() {
		return doctname;
	}

	public void setDoctname(String doctname) {
		this.doctname = doctname;
	}

	public String getExpertdegree() {
		return expertdegree;
	}

	public void setExpertdegree(String expertdegree) {
		this.expertdegree = expertdegree;
	}

	public String getCancelled() {
		return cancelled;
	}

	public void setCancelled(String cancelled) {
		this.cancelled = cancelled;
	}

	public String getCanceltime() {
		return canceltime;
	}

	public void setCanceltime(String canceltime) {
		this.canceltime = canceltime;
	}

	public String getRegistertype() {
		return registertype;
	}

	public void setRegistertype(String registertype) {
		this.registertype = registertype;
	}

	public String getAppodate() {
		return appodate;
	}

	public void setAppodate(String appodate) {
		this.appodate = appodate;
	}

	public String getAppostarttime() {
		return appostarttime;
	}

	public void setAppostarttime(String appostarttime) {
		this.appostarttime = appostarttime;
	}

	public String getAppoendtime() {
		return appoendtime;
	}

	public void setAppoendtime(String appoendtime) {
		this.appoendtime = appoendtime;
	}

	public String getAppoperiod() {
		return appoperiod;
	}

	public void setAppoperiod(String appoperiod) {
		this.appoperiod = appoperiod;
	}

	public String getResnumber() {
		return resnumber;
	}

	public void setResnumber(String resnumber) {
		this.resnumber = resnumber;
	}

	public String getSurplusnum() {
		return surplusnum;
	}

	public void setSurplusnum(String surplusnum) {
		this.surplusnum = surplusnum;
	}

	public String getRegisterfee() {
		return registerfee;
	}

	public void setRegisterfee(String registerfee) {
		this.registerfee = registerfee;
	}

	public String getSyncdate() {
		return syncdate;
	}

	public void setSyncdate(String syncdate) {
		this.syncdate = syncdate;
	}

	public String getModifydate() {
		return modifydate;
	}

	public void setModifydate(String modifydate) {
		this.modifydate = modifydate;
	}

	public String getDeletedate() {
		return deletedate;
	}

	public void setDeletedate(String deletedate) {
		this.deletedate = deletedate;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String getId() {
		return this.id;
	}

	@Override
	public String toString() {
		return "AppoResources [id=" + id + ", appoid=" + appoid
				+ ", hospitalcode=" + hospitalcode + ", hospitalname="
				+ hospitalname + ", appotemplateid=" + appotemplateid
				+ ", appocode=" + appocode + ", dept1code=" + dept1code
				+ ", dept1name=" + dept1name + ", dept2code=" + dept2code
				+ ", dept2name=" + dept2name + ", doctid=" + doctid
				+ ", doctcode=" + doctcode + ", doctname=" + doctname
				+ ", expertdegree=" + expertdegree + ", cancelled=" + cancelled
				+ ", canceltime=" + canceltime + ", registertype="
				+ registertype + ", appodate=" + appodate + ", appostarttime="
				+ appostarttime + ", appoendtime=" + appoendtime
				+ ", appoperiod=" + appoperiod + ", resnumber=" + resnumber
				+ ", surplusnum=" + surplusnum + ", registerfee=" + registerfee
				+ ", syncdate=" + syncdate + ", modifydate=" + modifydate
				+ ", deletedate=" + deletedate + "]";
	}
	
}
