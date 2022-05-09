package com.simplilearn.emailvalidation.package1;
import java.util.regex.*;
import java.util.Scanner;
public class Mo_No_validation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		while(true) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Mobile No");
		String no=sc.next();
		
		
		//Pattern ptrn = Pattern.compile("(0/91)?[7-9][0-9]{9}");  
		Pattern ptrn = Pattern.compile("[7-9]\\d");
		Matcher match = ptrn.matcher(no);  
		
		if(match.find() && match.group().equals(no)) {
			System.out.println("Valid no");
		}
		else {
			System.out.println("Invalid No");
			break;
		}
		
		}
//		Pattern p = Pattern.compile("^+[0-9");
//		Matecher m = p.matcher(no,Pattern.)
		
	}

}
