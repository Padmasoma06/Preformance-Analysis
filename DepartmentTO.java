package com.perftool.perftool;

import java.io.Serializable;

public class DepartmentTO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4827182927379041295L;

	private int deptNo;
	
	private String deptName;

	public int getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	
}
