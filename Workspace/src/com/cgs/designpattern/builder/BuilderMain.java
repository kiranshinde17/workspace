package com.cgs.designpattern.builder;

public class BuilderMain {

	public static void main(String[] args) {

		User user = new User.UserBuilder()
				.setId("user123")
				.setName("KIRAN")
				.setPhone("9529344433")
				.build();

		System.err.println(user);

		//////////////////////

		Employee employee = new Employee.EmployeeBuilder()
				.setId(1)
				.setName("Kiran")
				.setEmail("kiran@gmail.com")
				.build();

		System.out.println(employee);

	}

 
}
