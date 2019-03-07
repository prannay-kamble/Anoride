package com.gl.model;

import java.util.Set;

public class EmployeeBasicInfo {

	private String name;
	private int age;
	private String designation;
	private EmployeeEducation employeeEducation;
	private EmployeeHistory employeeHistory;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public EmployeeEducation getEmployeeEducation() {
		return employeeEducation;
	}

	public void setEmployeeEducation(EmployeeEducation employeeEducation) {
		this.employeeEducation = employeeEducation;
	}

	public EmployeeHistory getEmployeeHistory() {
		return employeeHistory;
	}

	public void setEmployeeHistory(EmployeeHistory employeeHistory) {
		this.employeeHistory = employeeHistory;
	}

	@Override
	public String toString() {
		return "EmployeeBasicInfo [name=" + name + ", age=" + age + ", designation=" + designation
				+ ", employeeEducation=" + employeeEducation + ", employeeHistory=" + employeeHistory + "]";
	}
	
	
	
	
}
