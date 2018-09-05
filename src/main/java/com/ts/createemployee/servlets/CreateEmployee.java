package com.ts.createemployee.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ts.employee.dao.EmployeeDAOImple;
import com.ts.employee.dto.EmployeeBean;

public class CreateEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EmployeeBean bean = new EmployeeBean();
		System.out.println(Integer.parseInt(request.getParameter("eid")));
		System.out.println(request.getParameter("fname"));
		System.out.println(request.getParameter("lname"));
		System.out.println(Long.parseLong(request.getParameter("phno")));
		System.out.println(request.getParameter("email"));
		System.out.println(request.getParameter("address1"));
		System.out.println(request.getParameter("address2"));
		System.out.println(request.getParameter("city"));
		System.out.println(Long.parseLong(request.getParameter("pincode")));
		
		
		bean.setEid(Integer.parseInt(request.getParameter("eid")));
		bean.setFname(request.getParameter("fname"));
		bean.setLname(request.getParameter("lname"));
		bean.setDob(request.getParameter("dob"));
		bean.setPhno(Long.parseLong(request.getParameter("phno")));
		bean.setEmail(request.getParameter("email"));
		bean.setAddress1(request.getParameter("address1"));
		bean.setAddress2(request.getParameter("address2"));
		bean.setCity(request.getParameter("city"));
		bean.setPincode(Long.parseLong(request.getParameter("pincode")));
		EmployeeDAOImple daoCreate = new EmployeeDAOImple();
		daoCreate.createEmployee(bean);	
		
	
	}

}
