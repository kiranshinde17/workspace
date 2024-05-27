package com.cgs.designpattern.factory;

public class CreditMessage implements Message {

	@Override
	public String getMessage() {
		System.out.println("Credit Message");
		return "Amount is credited to account";
	}

}
