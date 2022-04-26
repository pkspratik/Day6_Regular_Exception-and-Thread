package com.pks.calculator.package1;

import java.util.*;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//while(true) {
		
		for(; ;) {
		
		System.out.print("Please Enter First No  => ");
		Scanner sc = new Scanner(System.in);
		int first_no=sc.nextInt();
		
		
		System.out.print("Please Enter Second No => ");
		int second_no= sc.nextInt();
		
		
		System.out.println("Enter any No for performing operation");
		System.out.println(" 1 for Add\n 2 for Sub\n 3 for Mul\n 4 for Div\n 5 for Exit");
		
		int opration=sc.nextInt();
		
		if(opration==1)
		{
			int sum= first_no + second_no;
			System.out.println(first_no +" + "+ second_no +" = "+ sum);
			System.out.println();
			
		}
		if(opration==2)
		{
			int sub= first_no - second_no;
			System.out.println(first_no +" - "+ second_no +" = "+ sub);
			System.out.println();
		}
		if(opration==3)
		{
			int mul= first_no * second_no;
			System.out.println(first_no +" * "+ second_no +" = "+ mul);
			System.out.println();
		}
		if(opration==4)
		{
			int div= first_no / second_no;
			System.out.println(first_no +" / "+ second_no +" = "+ div);
			System.out.println();
		}
		if(opration == 5){
			break;
		}
		if(opration >5)
		{
			System.out.println("Enter Valid No");
		}
		}
		
	}

}
