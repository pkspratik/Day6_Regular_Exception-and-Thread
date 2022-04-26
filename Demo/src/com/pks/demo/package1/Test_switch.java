package com.pks.demo.package1;
import java.util.*;
public class Test_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter any number");
		int x=sc.nextInt();
		switch (x)
		{
		case 1:
		System.out.println("hello");
		break;
		case 10: System.out.println("hii");
		break;
		case 2: System.out.println("pratik");
		break;
		default : System.out.println("Enter Valide No");
		}
		
		
	}

}
