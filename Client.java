package com.assesment1;

public class Client {

	public static void main(String[] args) {
		
		//Employee 
		Employee employee=new Employee(1, "Mubeen", 5000);
		//Employee Salary
		System.out.println("Total Salary of Employee is : "+employee.calculateSalary());
		
		
		//Labour
		Employee labour=new Labour(1, "Sameer", 5000, 5, 100);
		
		//Labour Salary
		System.out.println("Total Salary of Labour is : "+labour.calculateSalary());
		
		//Manager
		Employee manager=new Manager(2, "Ravi", 10000, 500);
		
		//Manager Salary
		System.out.println("Total Salary Of Manager is : "+manager.calculateSalary());

	}

}
