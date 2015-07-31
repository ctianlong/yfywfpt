package com.newtouch.yfy.api;

import com.newtouch.lion.model.BaseEntity;

public class ServiceLog extends BaseEntity<Integer>{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2193824462337148606L;
	
	Integer   id  ;
	String   applyID  ;
	String   ip  ;
	String   methodName ;
	String   inputValue  ;
	String   outputValue  ;
	String   fcd  ;
	Integer   diversityTime  ;
	String   userId  ;
	 
	public String getApplyID() {
		return applyID;
	}
	public void setApplyID(String applyID) {
		this.applyID = applyID;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getMethodName() {
		return methodName;
	}
	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}
	public String getInputValue() {
		return inputValue;
	}
	public void setInputValue(String inputValue) {
		this.inputValue = inputValue;
	}
	public String getOutputValue() {
		return outputValue;
	}
	public void setOutputValue(String outputValue) {
		this.outputValue = outputValue;
	}
	public String getFcd() {
		return fcd;
	}
	public void setFcd(String fcd) {
		this.fcd = fcd;
	}
	 
	public Integer getDiversityTime() {
		return diversityTime;
	}
	public void setDiversityTime(Integer diversityTime) {
		this.diversityTime = diversityTime;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	 
	public ServiceLog() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ServiceLog [id=" + id + ", applyID=" + applyID + ", ip=" + ip
				+ ", methodName=" + methodName + ", inputValue=" + inputValue
				+ ", outputValue=" + outputValue + ", fcd=" + fcd
				+ ", diversityTime=" + diversityTime + ", userId=" + userId
				+ "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	 
	
}                           
