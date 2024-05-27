package com.cgs.test;

import java.util.concurrent.ConcurrentHashMap;

public class Test {

	public static void main(String[] args) {

		ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();

		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		map.put(4, "D");

		for (Integer key : map.keySet()) {
			System.out.println(key + ": " + map.get(key));
		}

		map.remove(2);

		// Check size
		System.out.println("Size of map: " + map.size());

		for (Integer key : map.keySet()) {
			System.out.println(key + ": " + map.get(key));
		}
	}
}
