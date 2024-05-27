package com.cgs.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentComparableMain {

	public static void main(String[] args) {
		
		List<StudentComparable> std = new ArrayList<StudentComparable>();
		std.add(new StudentComparable(28, "Kiran", "Shinde"));
		std.add(new StudentComparable(29, "Abhishek", "Patil"));
		std.add(new StudentComparable(27, "Ujjwal", "Kumar"));	
	
		System.out.println("without Sorted : " + std.toString());
		Collections.sort(std);
		System.out.println("Sorted : " + std);
	}
}
