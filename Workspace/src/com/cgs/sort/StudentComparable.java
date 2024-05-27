package com.cgs.sort;


public class StudentComparable implements Comparable<StudentComparable> {

	private int srNo;
	private String name;
	private String address;

	
	public StudentComparable(int srNo, String name, String address) {
		super();
		this.srNo = srNo;
		this.name = name;
		this.address = address;
	}

	

	@Override
	public String toString() {
		return "StudentComparable [srNo=" + srNo + ", name=" + name + ", address=" + address + "]";
	}



	@Override
	public int compareTo(StudentComparable o) {
		if(srNo==o.srNo) {
			return 0;
		} else if(srNo>o.srNo) {
			return -1;
		} else {
			return 1;
		}
 	}

}
