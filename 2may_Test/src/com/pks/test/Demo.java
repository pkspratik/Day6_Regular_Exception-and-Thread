package com.pks.test;
import java.util.Scanner;
public class Demo {
	
	
	static int no1,no2,ui;
	
	
	public static void main(String []args) {
		
		while(true) {
		
		Demo obj = new Demo();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Value ");
		 no1=sc.nextInt();
		
		System.out.println("Enter Second Value ");
		 no2=sc.nextInt();
		 
		 System.out.println("1. add \n 2. sub\n 3. mul\n 4. div\n 5. Exit");
		 
		 ui= sc.nextInt();
		 
		 if(ui == 1) {
			obj.add(); 
		 }
		 else if(ui==2)
		 {
			 sub();
		 }
		 else if(ui==3)
		 {
			obj.mul();
		 }
		 else if(ui==4)
		 {
			 div();
		 }
		 else {
			 System.out.println("Select Valid No");
			 break ;
		 }
		 
		}
	}
	
	
	void add() {
	   
		int sum = no1+no2;
		System.out.println("Sum of "+no1 +" "+no2+" => "+sum);
		
	}
	
	static void sub() {
		   
		int sum = no1-no2;
		System.out.println("Sub of "+no1 +" "+no2+" => "+sum);
		
	}
	void mul() {
		   
		int sum = no1*no2;
		System.out.println("Mul of "+no1 +" "+no2+" => "+sum);
		
	}
	
	static void div() {
		   
		int sum = no1/no2;
		System.out.println("Div of "+no1 +" "+no2+" => "+sum);
		
	}
	

}
class P{
	
}
class S{
	
}