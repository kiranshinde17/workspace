package com.cgs.designpattern.builder;

public class Employee {

	private final int id;
	private final String name;
	private final String email;

	private Employee(EmployeeBuilder employeeBuilder) {
		super();	
		this.id = employeeBuilder.id;
		this.name = employeeBuilder.name;
		this.email = employeeBuilder.email;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + "]";
	}

	public static class EmployeeBuilder {

		private int id;
		private String name;
		private String email;

		public EmployeeBuilder() {
			super();
			// TODO Auto-generated constructor stub
		}

		public EmployeeBuilder setId(int id) {
			this.id = id;
			return this;
		}

		public EmployeeBuilder setName(String name) {
			this.name = name;
			return this;
		}

		public EmployeeBuilder setEmail(String email) {
			this.email = email;
			return this;
		}

		public Employee build() {
			Employee employee = new Employee(this);
			return employee;
		}

	}
}
