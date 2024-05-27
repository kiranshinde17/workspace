package com.cgs.designpattern.singleton;

public class SingletonDP {

	private static SingletonDP singletonDP;
	
	private SingletonDP() {
		
	}
	
	public static SingletonDP getSingeltonInstance() {
		
		if(singletonDP == null) {
			synchronized (SingletonDP.class) {
				if(singletonDP == null) {
					singletonDP = new SingletonDP();
				}
			}
		}
		return singletonDP;
	}
}
