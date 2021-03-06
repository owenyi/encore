package com.encore.service;

import java.util.ArrayList;

import com.encore.vo.Employee;

// 기능의 Template을 모아 놓은 인터페이스...
public interface EmployeeMapService {
	
	void addEmployee(Employee e); // public abstract가 생략
	void deleteEmployee(String empId);
	void updateEmployee(Employee e);
	
	// Method Overloading
	ArrayList<Employee> findEmployees(String addr);
	ArrayList<Employee> findEmployees();
	
}
