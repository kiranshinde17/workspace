package com.cgs.java8.methodref;

public class CollegeClass {

	public static void clgClassMethod() {
		System.out.println("This is clg class method");
	}
	
	public static void main(String[] args) {
		
		CollegeInterface clg =	CollegeClass::clgClassMethod;
		clg.clgMethod();
		System.out.println(clg);
	}
}
