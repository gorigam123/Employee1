package com.ts.createemployee.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ts.employee.dao.EmployeeDAOImple;
import com.ts.employee.dto.EmployeeBean;

public class SearchEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;

protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	EmployeeBean bean = new EmployeeBean();
	bean.setEid(Integer.parseInt(request.getParameter("eid")));
	bean.setFname(request.getParameter("fname"));
	EmployeeDAOImple daoCreate = new EmployeeDAOImple();
	daoCreate.searchEmployee(bean);
}

}
