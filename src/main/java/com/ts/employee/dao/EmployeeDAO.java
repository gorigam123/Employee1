package com.ts.employee.dao;

import com.ts.employee.dto.EmployeeBean;
import com.ts.employee.dto.SearchEmployeeBean;

public interface EmployeeDAO {
	
	public void createEmployee(EmployeeBean Bean);

	public void updateEmployee(EmployeeBean Bean);

	public void deleteEmployee(EmployeeBean Bean);

	public void searchEmployee(SearchEmployeeBean Bean);
}
