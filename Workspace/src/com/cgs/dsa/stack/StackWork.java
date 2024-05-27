package com.cgs.dsa.stack;

import java.util.Stack;

public class StackWork {

	public static void main(String[] args) {
		
	//  create stack	
		Stack<String> stack = new Stack<String>();
		stack.push("I");
		stack.push("am");
		stack.push("Learning");
		stack.push("STACK");
		
		System.out.println("stack :: " + stack);
		
// return top element without removing
		System.out.println("top element of stack is :: " + stack.peek());
		
		//removing top element 
		stack.pop();
        System.out.println("Final Stack: " + stack);

         
	}
}
