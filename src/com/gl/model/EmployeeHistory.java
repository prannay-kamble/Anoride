package com.gl.model;

import java.util.List;

public class EmployeeHistory {

	private List<String> orgnationName;
	private double duration;
	private String projectWork;

	public List<String> getOrgnationName() {
		return orgnationName;
	}

	public void setOrgnationName(List<String> orgnationName) {
		this.orgnationName = orgnationName;
	}

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}

	

	public String getProjectWork() {
		return projectWork;
	}

	public void setProjectWork(String projectWork) {
		this.projectWork = projectWork;
	}
	
	
	@Override
	public String toString() {
		return "EmployeeHistory [orgnationName=" + orgnationName + ", duration=" + duration + ", projectWork="
				+ projectWork + "]";
	}
}
