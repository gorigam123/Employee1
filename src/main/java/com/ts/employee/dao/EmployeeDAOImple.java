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
import com.ts.employee.dto.SearchEmployeeBean;

public class EmployeeDAOImple implements EmployeeDAO{
	
	public void createEmployee(EmployeeBean bean) {
		try {
			 Connection con = null;
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db", "root", "root");
			PreparedStatement pstmt1 = con.prepareStatement("insert into employee_info values(?,?,?)");
			PreparedStatement pstmt2 = con.prepareStatement("insert into employee_contactinfo values(?,?,?,?)");
			PreparedStatement pstmt3 = con.prepareStatement("insert into employee_addressinfo values(?,?,?,?,?)");
			pstmt1.setInt(1, bean.getEid());
			pstmt1.setString(2, bean.getFname());
			pstmt1.setString(3, bean.getLname());
			pstmt2.setInt(1, bean.getEid());
			pstmt2.setLong(2, bean.getPhno());
			pstmt2.setString(3, bean.getEmail());
			pstmt2.setString(4, bean.getDob());
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
			Connection con=null;
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "root");
			
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void deleteEmployee(EmployeeBean bean) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db", "root", "root");
			PreparedStatement pstmt1 = con.prepareStatement("select * from employee_info where eid = ?");
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

	public void searchEmployee(SearchEmployeeBean bean) {
		try {
			Connection con=null;
			ResultSet res=null;
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db", "root", "root");
			PreparedStatement pstmt = con.prepareStatement("select * from employee_info where empid=? ");
		
			PreparedStatement pstmt1 = con.prepareStatement("select * from employee_info where firstname=?");
			if(bean.getFname()!=null)
			{
				pstmt1.setString(2, bean.getFname());
				res = pstmt.executeQuery();
				
			}
			else {
				pstmt.setInt(1, bean.getEid());
				res = pstmt.executeQuery();
			}
			
			
			while(res.next())
			{
				System.out.println(res.getInt("empid"));
				System.out.println(res.getString("firstname"));
				System.out.println(res.getString("lastname"));
			
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



}
