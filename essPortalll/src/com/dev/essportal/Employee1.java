package com.dev.essportal;

import java.util.ArrayList;

public class Employee1 {
	static ArrayList<EmployeeInfo> arr = new ArrayList<EmployeeInfo>();

	public static void main(String[] args) {
		EmployeeOperations eo = new EmployeeOperations();
		EmployeeInfo emp1 = eo.registration(101, "bhanuprakashreddy", "employee", "bhanu@gmail.com", "bhanu");
		EmployeeInfo emp2 = eo.registration(102, "prakashreddy", "employee", "prakash@gmail.com", "prakash");
		EmployeeInfo emp3 = eo.registration(103, "reddy", "manager", "reddy@gmail.com", "reddy");
		EmployeeLeaveInfo el1 = eo.requestForLeave(101, "12/23/12", "applying for leave");
		EmployeeLeaveInfo el2 = eo.requestForLeave(101, "12/21/12", "applying for leave");
		EmployeeLeaveInfo el3 = eo.requestForLeave(102, "23/12/12", "appling for leave");
		EmployeeLeaveInfo el4 = eo.requestForLeave(102, "23/12/13", "appling for leave");
		
		arr.add(emp1);
		arr.add(emp2);
		arr.add(emp3);
		System.out.println(login("reddy@gmail.com", "reddy"));
		
	}
		
	
	public static boolean login(String email,String password) {
		
		for (EmployeeInfo emp : arr) {
			
			if (emp.getEmail().equals(email) && emp.getPassword().equals(password)) {
				return true;
			}
			
		}
		
		return false;
	}
	
}
