package com.dev.essportal;

import java.util.ArrayList;
import java.util.HashMap;

public class EmployeeOperations {

	HashMap<String, ArrayList<EmployeeInfo>> hm = new HashMap<String, ArrayList<EmployeeInfo>>();
	HashMap<String, ArrayList<EmployeeLeaveInfo>> hm1 = new HashMap<String, ArrayList<EmployeeLeaveInfo>>();

	public boolean addEmployee(String s,ArrayList<EmployeeInfo> arr) {

		if (arr!=null) {
			hm.put(s, arr);
			System.out.println(hm);
			return true;
		}

		return false;

	}

	public boolean addLeaveRequest(ArrayList<EmployeeLeaveInfo> arr1,String s) {

		if (arr1!=null) {
			hm1.put(s, arr1);
			System.out.println(hm1);
			return true;
		}

		return false;

	}
	
	public void showLeaves() {
		System.out.println(hm1);
	}

	public EmployeeInfo registration(int id,String employeeName,String employeeType,String email,String password) {
		EmployeeInfo e = new EmployeeInfo();
		e.setEmployeeId(id);
		e.setEmployeeName(employeeName);
		e.setEmployeeType(employeeType);
		e.setEmail(email);
		e.setPassword(password);
		return e;
	}
	
	public EmployeeLeaveInfo requestForLeave(int id,String date,String status) {
		EmployeeLeaveInfo el = new EmployeeLeaveInfo();
		el.setEmployeeId(id);
		el.setLeaveDate(date);
		el.setLeaveStatus(status);
		return el;
	}


}
