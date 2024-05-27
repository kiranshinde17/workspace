package com.cgs.designpattern.factory;

public class MessageFactory {

	public Message sendMsg(String msgType) {
		
		if(msgType == null) {
			return null;
		}
		if(msgType.equalsIgnoreCase("DEBIT")) {
			return new DebitMessage();
		}
		if(msgType.equalsIgnoreCase("CREDIT")) {
			return new CreditMessage();
		}
		return null;
	}
}
