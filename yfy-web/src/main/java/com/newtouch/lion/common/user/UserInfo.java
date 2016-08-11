package com.newtouch.lion.common.user;

import java.io.Serializable;

import com.newtouch.lion.model.system.Department;

public class UserInfo implements Serializable {
	
	private static final long serialVersionUID = 1L;
	/**用户名*/
	private String username;
	/**用户ID*/
	private Long id;
	
	/** 用户真实姓名－中文 */
	private String realnameZh;
	/** 用户真实姓名－英文 */
	private String realnameEn;
	
	private String password;
	
	private String userIP;
	
	private String image;
	
	private String macAddress;
	
	/**
	 * 用户部门ID
	 */
	private Long departmentId;
	
	public Long getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}
	
	private Department department;
	
	public Department getDepartment() {
		return department;
	}
	
	public void setDepartment(Department department) {
		this.department = department;
	}
	
	public UserInfo(String username, Long id, String realnameZh, String realnameEn, String image,
			Department department) {
		super();
		this.username = username;
		this.id = id;
		this.realnameZh = realnameZh;
		this.realnameEn = realnameEn;
		this.image = image;
		this.department = department;
	}

	public UserInfo(String username, Long id, String realnameZh, String realnameEn, String image, Long departmentId) {
		super();
		this.username = username;
		this.id = id;
		this.realnameZh = realnameZh;
		this.realnameEn = realnameEn;
		this.image = image;
		this.departmentId = departmentId;
	}

	public UserInfo() {
	}

	
	/**
	 * @param username
	 * @param id
	 */
	public UserInfo(String username, Long id) {
		super();
		this.username = username;
		this.id = id;
	}


	/**
	 * @param username
	 * @param id
	 * @param realName
	 */
	public UserInfo(String username, Long id, String realnameZh,String realnameEn) {
		super();
		this.username = username;
		this.id = id;
		this.realnameZh = realnameZh;
		this.realnameEn=realnameEn;
	}
	
	/**
	 * @param username
	 * @param id
	 * @param realName
	 * @param image
	 */
	public UserInfo(String username, Long id, String realnameZh,String realnameEn,String image) {
		super();
		this.username = username;
		this.id = id;
		this.realnameZh = realnameZh;
		this.realnameEn=realnameEn;
		this.image = image;
	}



	public UserInfo(String username, Long id, String realnameZh,String realnameEn,String password,
			String userIP) {
		this.username = username;
		this.id = id;
		this.realnameZh = realnameZh;
		this.realnameEn=realnameEn;
		this.password = password;
		this.userIP = userIP;
	}
	
	public UserInfo(String username, Long id, String realnameZh,String realnameEn,String password,
			String userIP,String image) {
		this.username = username;
		this.id = id;
		this.realnameZh = realnameZh;
		this.realnameEn=realnameEn;
		this.password = password;
		this.userIP = userIP;
		this.image = image;
	}

	public Long getId() {
		return this.id;
	}

	public String getLoginId() {
		return this.username;
	}
 
	public String getPassword() {
		return this.password;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setLoginId(String loginId) {
		this.username = loginId;
	}

	 

	public void setPassword(String password) {
		this.password = password;
	}

	public java.util.Locale getPreferredLocale() {
		// return
		return null;
	}

	public String getUserIP() {
		return this.userIP;
	}

	public void setUserIP(String userIP) {
		this.userIP = userIP;
	}



	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}



	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the macAddress
	 */
	public String getMacAddress() {
		return macAddress;
	}

	/**
	 * @return the image
	 */
	public String getImage() {
		return image;
	}



	/**
	 * @param image the image to set
	 */
	public void setImage(String image) {
		this.image = image;
	}



	/**
	 * @param macAddress the macAddress to set
	 */
	public void setMacAddress(String macAddress) {
		this.macAddress = macAddress;
	}



	/**
	 * @return the realnameZh
	 */
	public String getRealnameZh() {
		return realnameZh;
	}



	/**
	 * @param realnameZh the realnameZh to set
	 */
	public void setRealnameZh(String realnameZh) {
		this.realnameZh = realnameZh;
	}



	/**
	 * @return the realnameEn
	 */
	public String getRealnameEn() {
		return realnameEn;
	}



	/**
	 * @param realnameEn the realnameEn to set
	 */
	public void setRealnameEn(String realnameEn) {
		this.realnameEn = realnameEn;
	}
	
	
	
}
