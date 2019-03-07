package com.gl.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.gl.model.EmployeeBasicInfo;
import com.gl.model.EmployeeEducation;
import com.gl.model.EmployeeHistory;

public class EmployeeOperation {

	Map<Integer, EmployeeBasicInfo> save = new Hashtable();

	public void saveEmployee() {
		// first employee
		EmployeeBasicInfo employee = new EmployeeBasicInfo();
		employee.setName("pranay");
		employee.setAge(24);
		employee.setDesignation("developer");
		EmployeeEducation education = new EmployeeEducation();
		education.setPercentage(70.00);
		List<String> l1 = new ArrayList<>();
		l1.add("enggineering");
		l1.add("HSC");
		l1.add("SSC");
		education.setQulifation(l1);
		employee.setEmployeeEducation(education);
		EmployeeHistory history = new EmployeeHistory();
		history.setDuration(2);
		List<String> orgnation1 = new ArrayList<>();
		orgnation1.add("infosai");
		orgnation1.add("plusneed");
		history.setOrgnationName(orgnation1);
		history.setProjectWork("Spring boot rest API");
		employee.setEmployeeHistory(history);

		save.put(1, employee);

		// second employee
		EmployeeBasicInfo employee2 = new EmployeeBasicInfo();
		employee2.setName("abc");
		employee2.setAge(24);
		employee2.setDesignation("manager");
		EmployeeEducation education2 = new EmployeeEducation();
		education2.setPercentage(70.00);
		List<String> l2 = new ArrayList<>();
		l2.add("enggineering1");
		l2.add("HSC");
		l2.add("SSC");
		education2.setQulifation(l2);
		employee2.setEmployeeEducation(education2);
		EmployeeHistory history2 = new EmployeeHistory();
		history2.setDuration(2);
		List<String> orgnation2 = new ArrayList<>();
		orgnation2.add("TCS1");
		history2.setOrgnationName(orgnation2);
		history2.setProjectWork("project handling");
		employee2.setEmployeeHistory(history2);

		save.put(2, employee2);

		// third employee
		EmployeeBasicInfo employee3 = new EmployeeBasicInfo();
		employee3.setName("pratik");
		employee3.setAge(24);
		employee3.setDesignation("Admin ");
		EmployeeEducation education3 = new EmployeeEducation();
		education3.setPercentage(70.00);
		List<String> l3 = new ArrayList<>();
		l3.add("enggineering1");
		l3.add("HSC");
		l3.add("SSC");
		education3.setQulifation(l3);
		employee3.setEmployeeEducation(education3);
		EmployeeHistory history3 = new EmployeeHistory();
		history3.setDuration(3);
		List<String> orgnation3 = new ArrayList<>();

		history3.setOrgnationName(orgnation3);
		history3.setProjectWork("project handling");
		employee3.setEmployeeHistory(history3);

		save.put(3, employee3);
		
		
		
		EmployeeBasicInfo employee4 = new EmployeeBasicInfo();
		employee4.setName("rushab");
		employee4.setAge(40);
		employee4.setDesignation("developer");
		EmployeeEducation education4 = new EmployeeEducation();
		education4.setPercentage(70);
		List<String> l4 = new ArrayList<>();
		l4.add("enggineering1");
		l4.add("HSC");
		l4.add("SSC");
		education4.setQulifation(l4);
		employee4.setEmployeeEducation(education4);
		EmployeeHistory history4 = new EmployeeHistory();
		history4.setDuration(4);
		List<String> orgnation4 = new ArrayList<>();

		history4.setOrgnationName(orgnation4);
		history4.setProjectWork("rest api");
		employee4.setEmployeeHistory(history4);
		
		save.put(4, employee4);


	}

	public List<EmployeeBasicInfo> getAll() {

		Collection<EmployeeBasicInfo> info1 = save.values();

		return info1.stream().collect(Collectors.toList());
	}

	public List<EmployeeBasicInfo> getEmployeeBasedOnDesignation(String designation) {
		List<EmployeeBasicInfo> listemployee = new ArrayList<>();
		Collection<EmployeeBasicInfo> information = save.values();

		List<EmployeeBasicInfo> listEmployee = information.stream()
				.filter(employee -> employee.getDesignation().equalsIgnoreCase(designation))
				.collect(Collectors.toList());

		/*
		 * information.forEach(info -> { if
		 * (info.getDesignation().equalsIgnoreCase(designation)) {
		 * 
		 * listemployee.add(info); } });
		 */

		return listEmployee;
	}

	public List<EmployeeBasicInfo> getEmployeeBasedOnOrgnation(String orgnation) {
		
		Collection<EmployeeBasicInfo> information = save.values();

		List<EmployeeBasicInfo> listEmployee = information.stream()
				.filter(employee -> employee.getEmployeeHistory().getOrgnationName().size() == 0)
				.collect(Collectors.toList());

		return listEmployee;
	}
	
	
	
public List<EmployeeBasicInfo> getEmployeeBasedOndesgnationAndExprience(String desgnation ,double exprience) {
		
		Collection<EmployeeBasicInfo> information = save.values();

		List<EmployeeBasicInfo> listEmployee = information.stream()
				.filter(employee -> employee.getDesignation().equalsIgnoreCase("developer") && employee.getEmployeeHistory().getDuration()>2)
				.collect(Collectors.toList());

		return listEmployee;
	}

}
