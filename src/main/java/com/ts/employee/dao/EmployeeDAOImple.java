package com.ts.employee.dao;

import java.beans.beancontext.BeanContext;
import java.security.PrivilegedActionException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import org.omg.CORBA.Request;

import com.ts.employee.dto.EmployeeBean;

public class EmployeeDAOImple implements EmployeeDAO{
	
	public void createEmployee(EmployeeBean bean) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "root");
			PreparedStatement pstmt1 = con.prepareStatement("insert into employee_info values(?,?,?)");
			PreparedStatement pstmt2 = con.prepareStatement("insert into employee_contact_info values(?,?,?)");
			PreparedStatement pstmt3 = con.prepareStatement("insert into employee_address_info values(?,?,?,?,?)");
			pstmt1.setInt(1, bean.getEid());
			pstmt1.setString(2, bean.getFname());
			pstmt1.setString(3, bean.getLname());
			pstmt2.setInt(1, bean.getEid());
			pstmt2.setLong(2, bean.getPhno());
			pstmt2.setString(3, bean.getEmail());
			pstmt3.setString(2, bean.getAddress1());
			pstmt3.setString(3, bean.getAddress2());
			pstmt3.setInt(1, bean.getEid());
			pstmt3.setString(4, bean.getCity());
			pstmt3.setLong(5, bean.getPincode());
			pstmt1.execute();
			pstmt2.execute();
			pstmt3.execute();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void updateEmployee(EmployeeBean bean) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "root");
			
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void deleteEmployee(EmployeeBean bean) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "root");
			PreparedStatement pstmt1 = con.prepareStatement("select * from employeedata where eid = ? or name = ?");
			pstmt1.setInt(1, bean.getEid());
			pstmt1.setString(2, bean.getFname());
			ResultSet res = pstmt1.executeQuery();
			while(res.next())
			{
				int eid = res.getInt("eid");
				String fname=res.getString("fname");
				String lname=res.getString("lname");
				System.out.println(eid);
				System.out.println(fname);
				System.out.println(lname);
				
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void searchEmployee(EmployeeBean bean) {
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "root");
			PreparedStatement pstmt = con.prepareStatement("select from employeedata where eid=? or name=? ");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



}
