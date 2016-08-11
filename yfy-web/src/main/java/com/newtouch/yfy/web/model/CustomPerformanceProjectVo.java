package com.newtouch.yfy.web.model;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

public class CustomPerformanceProjectVo implements Serializable {

	private static final long serialVersionUID = 2439886460021092778L;
	/** ID */
	private Long id;
	/** 项目代 码 */
	@NotNull(message = "${sys.customperformanceproject.html.tip.projectCode}")
	private String projectCode;
	/** 项目名称 */
	@NotNull(message = "${sys.customperformanceproject.html.tip.projectName}")
	private String projectName;
	/** 项目单位 */
	private String projectUnit;
	/** 数据表 */
	private String dataTableName;
	/** 取数SQL */
	private String fetchSQL;
	/** SQL中的变量数目,可取2,3,4 */
	private Integer variableNumber;
	/** 数据类型 1 自动获取 0 手工输入 */
	@NotNull(message = "${sys.customperformanceproject.html.tip.dataType}")
	private Integer dataType;

	public Long getId() {
		return id;
	}

	public String getProjectCode() {
		return projectCode;
	}

	public void setProjectCode(String projectCode) {
		this.projectCode = projectCode;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getProjectUnit() {
		return projectUnit;
	}

	public void setProjectUnit(String projectUnit) {
		this.projectUnit = projectUnit;
	}

	public String getDataTableName() {
		return dataTableName;
	}

	public void setDataTableName(String dataTableName) {
		this.dataTableName = dataTableName;
	}

	public String getFetchSQL() {
		return fetchSQL;
	}

	public void setFetchSQL(String fetchSQL) {
		this.fetchSQL = fetchSQL;
	}

	public Integer getVariableNumber() {
		return variableNumber;
	}

	public void setVariableNumber(Integer variabelNumber) {
		this.variableNumber = variabelNumber;
	}

	public Integer getDataType() {
		return dataType;
	}

	public void setDataType(Integer dataType) {
		this.dataType = dataType;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public CustomPerformanceProjectVo() {
		super();
	}

	public CustomPerformanceProjectVo(Long id, String projectCode, String projectName, String projectUnit,
			String dataTableName, String fetchSQL, Integer variableNumber, Integer dataType) {
		super();
		this.id = id;
		this.projectCode = projectCode;
		this.projectName = projectName;
		this.projectUnit = projectUnit;
		this.dataTableName = dataTableName;
		this.fetchSQL = fetchSQL;
		this.variableNumber = variableNumber;
		this.dataType = dataType;
	}

	@Override
	public String toString() {
		return "CustomPerformanceProjectVo [id=" + id + ", projectCode=" + projectCode + ", projectName=" + projectName
				+ ", projectUnit=" + projectUnit + ", dataTableName=" + dataTableName + ", fetchSQL=" + fetchSQL
				+ ", variableNumber=" + variableNumber + ", dataType=" + dataType + "]";
	}

}
