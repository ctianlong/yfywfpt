package com.newtouch.yfy.api;

import com.newtouch.lion.model.BaseEntity;

public class Dept extends BaseEntity<Long>{
   
	/**
	 * 
	 */
	private static final long serialVersionUID = 4857806886105906654L;
	private Long id;
	
	public void setId(Long id) {
		this.id = id;
	}
	private  Long deptid        ;
	public Long getDeptid() {
		return deptid;
	}

	public void setDeptid(Long deptid) {
		this.deptid = deptid;
	}
	private  String hospitalcode  ;
	private  String hospitalname  ;
	private  String deptcode      ;
	private  String deptname      ;
	private  String partcode      ;
	private  String desc          ;
	private  String flag          ;
	private  String syncdate      ;
	private  String modifydate    ;
	private  String deletedate    ;
	
	@Override
	public Long getId() {
		return this.id;
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
	public String getDeptcode() {
		return deptcode;
	}
	public void setDeptcode(String deptcode) {
		this.deptcode = deptcode;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	public String getPartcode() {
		return partcode;
	}
	public void setPartcode(String partcode) {
		this.partcode = partcode;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
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
	public Dept() {
		super();
	}
	public Dept(Long deptid,String hospitalcode, String hospitalname,
			String deptcode, String deptname, String partcode, String desc,
			String flag, String syncdate, String modifydate, String deletedate) {
		super();
		this.deptid = deptid; 
		this.hospitalcode = hospitalcode;
		this.hospitalname = hospitalname;
		this.deptcode = deptcode;
		this.deptname = deptname;
		this.partcode = partcode;
		this.desc = desc;
		this.flag = flag;
		this.syncdate = syncdate;
		this.modifydate = modifydate;
		this.deletedate = deletedate;
	}
	@Override
	public String toString() {
		return "Dept [deptid=" + deptid + ", hospitalcode=" + hospitalcode
				+ ", hospitalname=" + hospitalname + ", deptcode=" + deptcode
				+ ", deptname=" + deptname + ", partcode=" + partcode
				+ ", desc=" + desc + ", flag=" + flag + ", syncdate="
				+ syncdate + ", modifydate=" + modifydate + ", deletedate="
				+ deletedate + "]";
	}
	
	
}
