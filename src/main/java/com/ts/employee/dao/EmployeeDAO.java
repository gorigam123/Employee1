package com.ts.employee.dao;

import com.ts.employee.dto.EmployeeBean;

public interface EmployeeDAO {
	
	public void createEmployee(EmployeeBean Bean);

	public void updateEmployee(EmployeeBean Bean);

	public void deleteEmployee(EmployeeBean Bean);

	public void searchEmployee(EmployeeBean Bean);
}
