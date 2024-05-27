package com.cgs.designpattern.factory;

public class MessageMain {

	public static void main(String[] args) {
		
		MessageFactory sendMessage = new MessageFactory();
 
		Message msg = sendMessage.sendMsg("CREDIT");
		
		System.out.println("Message : " + msg.getMessage());
		
	}
}
