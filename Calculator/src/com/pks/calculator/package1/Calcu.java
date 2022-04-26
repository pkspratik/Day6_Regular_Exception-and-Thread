package com.pks.calculator.package1;
import java.util.Scanner;
public class Calcu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First_No => ");
		int first_no = sc.nextInt();
		
		
		System.out.print("Enter Second_No =>");
		int second_no=sc.nextInt();
		
		System.out.println("Enter Operator like + , - , * , /");
		
		String op =sc.next();
		
		if(op.equals("+") ||op.equals("-") || op.equals("*")||op.equals("/") )
		{
			if(op.equals("+"))
			{
				int sum = first_no + second_no;
				System.out.println("Sum of "+first_no +" + "+ second_no +" => "+sum);
			}
			else if(op.equals("-"))
			{
				int sub = first_no - second_no;
				System.out.println("Sub of "+first_no +" - "+ second_no +" => "+sub);
			}
			else if(op.equals("*"))
			{
				int mul = first_no * second_no;
				System.out.println("mul of "+first_no +" * "+ second_no +" => "+mul);
			}
			else if(op.equals("/"))
			{
				int div = first_no / second_no;
				System.out.println("div of "+first_no +" / "+ second_no +" => "+div);
			}
			
		}
		else {
			System.out.println("Enter valid Operator");
		}
		
	}

}
