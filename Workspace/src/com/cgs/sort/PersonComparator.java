package com.cgs.sort;

public class PersonComparator {

	private int age;
	private String firstName;
	private String lastName;

	public PersonComparator(int age, String firstName, String lastName) {
		super();
		this.age = age;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	@Override
	public String toString() {
		return "PersonComparator [age=" + age + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}

}
