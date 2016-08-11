package com.newtouch.yfy.web.model;

import java.io.Serializable;

public class DemoModelVo implements Serializable {
	
	private static final long serialVersionUID = -5126614542285944220L;

	private Long id;
	
	private String nameZh;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNameZh() {
		return nameZh;
	}

	public void setNameZh(String nameZh) {
		this.nameZh = nameZh;
	}
	
	public DemoModelVo() {
	}

	public DemoModelVo(Long id, String nameZh) {
		super();
		this.id = id;
		this.nameZh = nameZh;
	}
	

}
