package com.cgs.sort;

import java.util.Comparator;

public class PersonNamedCompere implements Comparator<PersonComparator>{

	 

	@Override
	public int compare(PersonComparator o1, PersonComparator o2) {
		 return o1.getLastName().compareTo(o2.getLastName());
	}

}
