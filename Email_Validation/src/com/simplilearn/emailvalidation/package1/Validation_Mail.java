package com.simplilearn.emailvalidation.package1;
import java.util.Scanner;
import java.util.regex.*;
public class Validation_Mail {

	public static void main(String[] args) {
		
		System.out.println("Enter Mail ");
		
		Scanner sc = new Scanner(System.in);
		String userinp =sc.next();
		
		
		System.out.println("User Inter Email => "+userinp);
		
		//System.out.println(validEmail(userinp));
		
		boolean check =validEmail(userinp);
		
		if(check==true) {
			System.out.println("Email Id Is Valid");
		}
		else {
			System.out.println("Invalid Email Id");
		}
		
		
//		if(userinp.endsWith("@gmail.com")) {
//			System.out.println("Valid email");
//		}
//		else {
//			System.out.println("Enter valid Email");
//		}
		

	}
	
	public static boolean validEmail(String input) {
		String emailRegex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
		Pattern emailpat = Pattern.compile(emailRegex,Pattern.CASE_INSENSITIVE);
		Matcher matcher= emailpat.matcher(input);
		
		return matcher.find();
	}

}
