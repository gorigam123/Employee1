package com.ts.createemployee.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ts.employee.dto.EmployeeBean;

public class CreateEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EmployeeBean bean = new EmployeeBean();
		bean.setEid(Integer.parseInt(request.getParameter("eid")));
		bean.setFname(request.getParameter("fname"));
		bean.setLname(request.getParameter("lname"));
		bean.setPhno(Long.parseLong(request.getParameter("phno")));
		bean.setEmail(request.getParameter("email"));
		bean.setAddress1(request.getParameter("address1"));
		bean.setAddress2(request.getParameter("address2"));
		bean.setCity(request.getParameter("city"));
		bean.setPincode(Long.parseLong(request.getParameter("pincode")));
	

		

		
	}

}
