package com.operation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.model.Employee;

public class EmployeeOperation {
	
	

	Employee e = new Employee();
	Scanner sc = new Scanner(System.in);
	public void addemployee() throws ClassNotFoundException, SQLException
{
		Class.forName("com.mysql.cj.jdbc.Driver");	
		//String sql = "Create table employee(name charvar(20), id int, salary int, mobileno int, age int, location varchar(20))";
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root", "Root");
		System.out.println("Enter your Name:");
		String nm=sc.next();
		e.setEname(nm);
		
		System.out.println("Enter Id: ");
		int id=sc.nextInt();
		e.setEid(id);
		
		System.out.println("Enter salary :");
		float sal=sc.nextFloat();
		e.setSalary(sal);
		
		
		System.out.println("Enter your Age:");
		int age=sc.nextInt();
		e.setAge(age);
		
		System.out.println("Enter your mobile no");
		long no=sc.nextLong();
		e.setMobNO(no);
		
		System.out.println("Enter your Location");
		String loc=sc.next();
		e.setLocation(loc);
		
		String sql = "insert into project values(?,?,?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1,nm);
		ps.setInt(2, id);
		ps.setFloat(3, sal);
		ps.setInt(4, age);
		ps.setLong(5, no);
		ps.setString(6, loc);
		
		ps.execute();
		
		ps.close();
		con.close();
		
	
		
		
		
		
	}
	
	public void viewemployee() throws SQLException, ClassNotFoundException
	{
		
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");	
		//String sql = "Create table employee(name charvar(20), id int, salary int, mobileno int, age int, location varchar(20))";
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root", "Root");
		
		String sql = "select * from project";
		Statement smt = con.createStatement();
		ResultSet res = smt.executeQuery(sql);
		while(res.next())
		{
		System.out.println("Employee Name :"+ res.getString("Name"));
		System.out.println("Employee ID : "+ res.getInt("Eid"));
		
		System.out.println("Salary: "+res.getFloat("Salary"));
		System.out.println("Age :"+res.getInt("Age"));
		System.out.println("MobileNo:"+res.getLong("MobNo"));
		System.out.println("Location:"+res.getString("Location"));
		
		
		
		
		}
		smt.close();
		con.close();
		}
		
		
		

		catch (Exception e){
			//e.printStackTrace();

		}
		
		
		
		
		
		
	}
	public void updateemployee() throws ClassNotFoundException, SQLException{
	
	{
		
		Scanner sc = new Scanner(System.in);
		
		Class.forName("com.mysql.cj.jdbc.Driver");	
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root", "Root");
		
				String updateQuery = "update project SET Name = ?, Age = ?, Salary = ?, MobNo = ?, Location = ? WHERE Eid = ?";
				
				 PreparedStatement ps = con.prepareStatement(updateQuery);
            
            
		
		
		System.out.println("Enter New employee Name : ");
		String Name= sc.next();
		ps.setString(1, Name);
		
		System.out.println("Enter new Age ");
		int AGE = sc.nextInt();
		ps.setInt(2, AGE);
		
		
		System.out.println("Enter New Salary : ");
		float Salary = sc.nextFloat();
		ps.setFloat(3, Salary);
		
		System.out.println("Enter new MobileNo");
		Long mobno = sc.nextLong();
		ps.setLong(4,mobno);
		
		System.out.println("Enter new Location : ");
		String location = sc.next();
		ps.setString(5, location);
		
		System.out.println("Enter employee ID to update : ");
		int ID = sc.nextInt();
		ps.setInt(6, ID);
		
		
		
		
		
		ps.execute();
		ps.close();
		con.close();
		
		
	}
}
	public void deleteemployee()
	{
		System.out.println("Enter Employee ID to delete:");
        int empId = sc.nextInt();
		
	}
	
	}

