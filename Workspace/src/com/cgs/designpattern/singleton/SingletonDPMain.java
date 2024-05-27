package com.cgs.designpattern.singleton;

public class SingletonDPMain {

	public static void main(String[] args) {
		
		SingletonDP sdp1 = SingletonDP.getSingeltonInstance();
		System.out.println(sdp1.hashCode());
		
		SingletonDP sdp2 = SingletonDP.getSingeltonInstance();
		System.out.println(sdp2.hashCode());
	}
}
