package com.gl.test;

import java.util.List;

import com.gl.model.EmployeeBasicInfo;
import com.gl.service.EmployeeOperation;

public class EmployeeTest {

	public static void main(String[] args) {
		EmployeeOperation operation=new EmployeeOperation();
		
		  operation.saveEmployee();
		List<EmployeeBasicInfo>info= operation.getAll();
		
		
		List<EmployeeBasicInfo>listemployee=operation.getEmployeeBasedOnDesignation("developer");
		
		System.out.println(listemployee);
		
		List<EmployeeBasicInfo>listemployee2=operation.getEmployeeBasedOnOrgnation("globalLogic");
		
                  listemployee2.forEach(employee->{
                	  
                	  System.out.println(employee.getName());
                  });
                  
                  
               List<EmployeeBasicInfo>listEmployee3 =  operation.getEmployeeBasedOndesgnationAndExprience("developer", 3);

               System.out.println(listEmployee3);
	}

}
