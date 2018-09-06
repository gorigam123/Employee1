package com.ts.createemployee.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ts.employee.dao.EmployeeDAOImple;
import com.ts.employee.dto.DeleteEmployeeBean;


public class DeleteEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;


protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	DeleteEmployeeBean deleteEmployeeBean=new DeleteEmployeeBean();
	deleteEmployeeBean.setEid(Integer.parseInt(request.getParameter("eid")));
	EmployeeDAOImple bean = new EmployeeDAOImple();
	bean.deleteEmployee(deleteEmployeeBean);
	}

}
