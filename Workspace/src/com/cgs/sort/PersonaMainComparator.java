package com.cgs.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonaMainComparator {

	public static void main(String[] args) {
		
		List<PersonComparator> person = new ArrayList<PersonComparator>();
		person.add(new PersonComparator(28, "Kiran", "Shinde"));
		person.add(new PersonComparator(29, "Abhishek", "Patil"));
		person.add(new PersonComparator(27, "Ujjwal", "Kumar"));
		
//		Comparator<PersonComparator> comparingAge = Comparator.comparingInt(PersonComparator::getAge);
//
//		Collections.sort(person, comparingAge);
//		
//		for(PersonComparator personage : person) {
//			System.out.println(personage);
//		}
		
		Collections.sort(person, new PersonNamedCompere());
		System.err.println(person);
		
	}
}
