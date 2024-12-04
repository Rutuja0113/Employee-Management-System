package com.operation;

import java.util.Scanner;

import com.model.Employee;

public class EmployeeOperation {
	
	

	Employee e = new Employee();
	Scanner sc = new Scanner(System.in);
	public void addemployee()
{
		System.out.println("Enter your Name:");
		e.setEname(sc.next());
		
		System.out.println("Enter Id: ");
		e.setEid(sc.nextInt());
		
		System.out.println("Enter salary :");
		e.setSalary(sc.nextFloat());
		
		System.out.println("Enter your Mobile.No:");
		e.setMobNO(sc.nextLong());
		
		System.out.println("Enter your Age:");
		e.setAge(sc.nextInt());
		
		System.out.println("Enter your Location");
		e.setLocation(sc.next());
		
		
	}
	
	public void viewemployee()
	{
		System.out.println("Employee Name :"+ e.getEname());
		System.out.println("Empolyee ID : "+ e.getEid());
		System.out.println("Salary: "+e.getSalary());
		System.out.println("MobileNo:"+e.getMobNO());
		System.out.println("Age :"+e.getAge());
		System.out.println("Location:"+e.getLocation());
		
		
		
	}
	public void updateemployee()
	{
		
            
            
		System.out.println("Enter employee ID to update : ");
		int ID = sc.nextInt();
		
		System.out.println("Enter New employee Name : ");
		String Name= sc.next();
		
		System.out.println("Enter New Salary : ");
		float f = sc.nextFloat();
		
		System.out.println("Enter new Location : ");
		String s = sc.next();
		
	}
	public void deleteemployee()
	{
		System.out.println("Enter Employee ID to delete:");
        int empId = sc.nextInt();
		
	}
	
	}

