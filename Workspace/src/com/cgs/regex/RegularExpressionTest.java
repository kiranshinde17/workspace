package com.cgs.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionTest {

	/*
	 * Regular Expression (Regex) :- 
	 * It is an API to design the Pattern to Searching and Manipulate the String.
	 *  It is useful in Email and Password validation.
	 * 
	 * It comes under the java.util.regex pakage
	 * 
	 * It has classes like 1) Matches Class 2) Pattern Class 3) PatterSyntaxException Class
	 *  4) MatchResult interface
	 */

	        
	public static void main(String[] args) {
		String name = "KIRAN";
		Pattern compile = Pattern.compile(name);
		
		Matcher matcher = compile.matcher("K");
		boolean matches = matcher.matches();
		
		System.out.println(matches);
		
		/////////////
		
		boolean find = matcher.find(1);
		System.err.println(find);
		
		
 	}
	
}
