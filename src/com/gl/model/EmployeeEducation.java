package com.gl.model;

import java.util.List;

public class EmployeeEducation {

	private List<String> qulifation;
	private double percentage;

	public List<String> getQulifation() {
		return qulifation;
	}

	public void setQulifation(List<String> qulifation) {
		this.qulifation = qulifation;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	@Override
	public String toString() {
		return "EmployeeEducation [qulifation=" + qulifation + ", percentage=" + percentage + ", getQulifation()="
				+ getQulifation() + ", getPercentage()=" + getPercentage() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
}
