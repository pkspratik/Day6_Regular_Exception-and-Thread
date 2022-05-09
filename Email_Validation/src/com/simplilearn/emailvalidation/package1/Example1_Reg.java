package com.simplilearn.emailvalidation.package1;

import java.util.regex.*;

public class Example1_Reg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pattern p =Pattern.compile("[A-Z0-9a-z]");
		Matcher m= p.matcher("abcABC1234" );
		
		while(m.find()) {
			System.out.println(/*m.start() +" "+m.end()+" "+*/m.group());
		}
		
		

	}

}
