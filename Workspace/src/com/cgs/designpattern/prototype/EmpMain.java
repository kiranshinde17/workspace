package com.cgs.designpattern.prototype;

public class EmpMain {

	public static void main(String[] args) {
		
		System.err.println("Prototype Design Pattern ---->");
		
		EmployeeProtoType employeeProtoType = new EmployeeProtoType();	
		try {
			employeeProtoType.setId(1);
			employeeProtoType.setName("Kiran");
			employeeProtoType.setAddress("Chennai");
			
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("before cloning " + employeeProtoType);
		//////
		employeeProtoType.clone();
		
		employeeProtoType.setId(2);
		employeeProtoType.setName("Shailesh");
		employeeProtoType.setAddress("Salem");
		System.out.println("after cloning " + employeeProtoType);


	}
}
