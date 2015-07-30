package com.newtouch.yfy.api;

import java.util.Date;

import com.newtouch.lion.model.BaseEntity;

/**
 * 预约 资源表
 * 
 * @author Administrator
 *
 */
public class AppoInfo extends BaseEntity<String> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2296961940438555338L;
	
	private String id;
	private String appoInfoid;               
	private String appono;
	private String cardno;
	private String patid;
	private String patname;
	private String patcard;
	private String tel;
	private String appotemplateid; // '预约资源模板id(说明：具体的资源模板id，具体到某天上下午的某个时间段。)',
	private String appocode;
	private String partcode; // '项目类型 (说明：开放项目类别 如：01 专家 08专题 …)',
	private String deptcode;
	private String deptname;
	private String doctcode;
	private String doctname;
	private String appodate;
	private Date appostarttime; // '预约模板中的开始时间',
	private Date appoendtime; // 预约模板中的结束时间',
	private Integer appoperiod; // '显示此项目时间段是0上午、1下午、2全天',
	private String appodetail;
	private String queueno;
	private String waittime;
	private Date exectime;
	private String hospitalcode; // '院区',
	private String hospitalname;
	private String repealdate;
	private String repealcause;
	private Integer flag; // '0 :正常 1: 预约取消, 9:删除',
	private String appofrom; // '如crm挂号网支付宝等',
	private Double regid;
	private Date regdate;
	private String regtype;
	private Integer  isdove; // '0 否 1 是',
	private String createdate; // '用户在支付宝端提交预约的时间',
	private Date syncdate;
	private Date modifydate;
	private Date deletedate;
	

	public String getAppoInfoid() {
		return appoInfoid;
	}

	public void setAppoInfoid(String appoInfoid) {
		this.appoInfoid = appoInfoid;
	}

	public String getAppono() {
		return appono;
	}

	public void setAppono(String appono) {
		this.appono = appono;
	}

	public String getCardno() {
		return cardno;
	}

	public void setCardno(String cardno) {
		this.cardno = cardno;
	}

	public String getPatid() {
		return patid;
	}

	public void setPatid(String patid) {
		this.patid = patid;
	}

	public String getPatname() {
		return patname;
	}

	public void setPatname(String patname) {
		this.patname = patname;
	}

	public String getPatcard() {
		return patcard;
	}

	public void setPatcard(String patcard) {
		this.patcard = patcard;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
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

	public String getPartcode() {
		return partcode;
	}

	public void setPartcode(String partcode) {
		this.partcode = partcode;
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

	public String getAppodate() {
		return appodate;
	}

	public void setAppodate(String appodate) {
		this.appodate = appodate;
	}

	public Date getAppostarttime() {
		return appostarttime;
	}

	public void setAppostarttime(Date appostarttime) {
		this.appostarttime = appostarttime;
	}

	public Date getAppoendtime() {
		return appoendtime;
	}

	public void setAppoendtime(Date appoendtime) {
		this.appoendtime = appoendtime;
	}

	public Integer getAppoperiod() {
		return appoperiod;
	}

	public void setAppoperiod(Integer appoperiod) {
		this.appoperiod = appoperiod;
	}

	public String getAppodetail() {
		return appodetail;
	}

	public void setAppodetail(String appodetail) {
		this.appodetail = appodetail;
	}

	public String getQueueno() {
		return queueno;
	}

	public void setQueueno(String queueno) {
		this.queueno = queueno;
	}

	public String getWaittime() {
		return waittime;
	}

	public void setWaittime(String waittime) {
		this.waittime = waittime;
	}

	public Date getExectime() {
		return exectime;
	}

	public void setExectime(Date exectime) {
		this.exectime = exectime;
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

	public String getRepealdate() {
		return repealdate;
	}

	public void setRepealdate(String repealdate) {
		this.repealdate = repealdate;
	}

	public String getRepealcause() {
		return repealcause;
	}

	public void setRepealcause(String repealcause) {
		this.repealcause = repealcause;
	}

	public Integer getFlag() {
		return flag;
	}

	public void setFlag(Integer flag) {
		this.flag = flag;
	}

	public String getAppofrom() {
		return appofrom;
	}

	public void setAppofrom(String appofrom) {
		this.appofrom = appofrom;
	}

	public Double getRegid() {
		return regid;
	}

	public void setRegid(Double regid) {
		this.regid = regid;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

	public String getRegtype() {
		return regtype;
	}

	public void setRegtype(String regtype) {
		this.regtype = regtype;
	}

	public Integer getIsdove() {
		return isdove;
	}

	public void setIsdove(Integer isdove) {
		this.isdove = isdove;
	}

	public String getCreatedate() {
		return createdate;
	}

	public void setCreatedate(String createdate) {
		this.createdate = createdate;
	}

	public Date getSyncdate() {
		return syncdate;
	}

	public void setSyncdate(Date syncdate) {
		this.syncdate = syncdate;
	}

	public Date getModifydate() {
		return modifydate;
	}

	public void setModifydate(Date modifydate) {
		this.modifydate = modifydate;
	}

	public Date getDeletedate() {
		return deletedate;
	}

	public void setDeletedate(Date deletedate) {
		this.deletedate = deletedate;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String getId() {
		return this.id;
	}

	public AppoInfo() {
		super();
	}

	@Override
	public String toString() {
		return "AppoInfo [id=" + id + ", appoInfoid=" + appoInfoid
				+ ", appono=" + appono + ", cardno=" + cardno + ", patid="
				+ patid + ", patname=" + patname + ", patcard=" + patcard
				+ ", tel=" + tel + ", appotemplateid=" + appotemplateid
				+ ", appocode=" + appocode + ", partcode=" + partcode
				+ ", deptcode=" + deptcode + ", deptname=" + deptname
				+ ", doctcode=" + doctcode + ", doctname=" + doctname
				+ ", appodate=" + appodate + ", appostarttime=" + appostarttime
				+ ", appoendtime=" + appoendtime + ", appoperiod=" + appoperiod
				+ ", appodetail=" + appodetail + ", queueno=" + queueno
				+ ", waittime=" + waittime + ", exectime=" + exectime
				+ ", hospitalcode=" + hospitalcode + ", hospitalname="
				+ hospitalname + ", repealdate=" + repealdate
				+ ", repealcause=" + repealcause + ", flag=" + flag
				+ ", appofrom=" + appofrom + ", regid=" + regid + ", regdate="
				+ regdate + ", regtype=" + regtype + ", isdove=" + isdove
				+ ", createdate=" + createdate + ", syncdate=" + syncdate
				+ ", modifydate=" + modifydate + ", deletedate=" + deletedate
				+ "]";
	}

}
