package com.cgs.designpattern.factory;

public class DebitMessage implements Message {

	@Override
	public String getMessage() {
		System.out.println("Debit Message");
		return "Amount is Debited from account";
	}

}
