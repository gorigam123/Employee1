package com.ts.createemployee.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ts.employee.dao.EmployeeDAOImple;
import com.ts.employee.dto.EmployeeBean;
import com.ts.employee.dto.SearchEmployeeBean;

public class SearchEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;

protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	SearchEmployeeBean bean = new SearchEmployeeBean();
	if(request.getParameter("eid")!=null)
	{
		bean.setEid(Integer.parseInt(request.getParameter("eid")));
	}
	else {
		bean.setFname(request.getParameter("fname"));
	}
	
	if(request.getParameter("eid")!=null)
	{
		System.out.println(Integer.parseInt(request.getParameter("eid")));

	}
	System.out.println(request.getParameter("fname"));
	
	EmployeeDAOImple empDAOImpl = new EmployeeDAOImple();
	empDAOImpl.searchEmployee(bean);
	
}

}
