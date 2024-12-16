package com.client;

import com.operation.EmployeeOperation;

import java.sql.SQLException;
import java.util.*;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		EmployeeOperation eo = new EmployeeOperation();
		
	Scanner sr = new Scanner(System.in);
		while (true) {
			
			
			System.out.println("------Employee Management System---------");
			
			System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Update Employee");
            System.out.println("4. Delete Employee");
            System.out.println("5. Exit");
            System.out.println("----------------------------------");
            System.out.println("Enter your choice");
			
			
			int choice = sr.nextInt();
			
			switch(choice)
			{
			case 1 :
				eo.addemployee();
				break;
			case 2:
				eo.viewemployee();
				break;
			case 3:
				eo.updateemployee();
				break;
			case 4:
				eo.deleteemployee();
				break;
				
			default:
				System.out.println("Invalid choice!!");
			}
			
		}

	}

}
