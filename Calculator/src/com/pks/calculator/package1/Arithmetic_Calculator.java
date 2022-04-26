package com.pks.calculator.package1;

public class Arithmetic_Calculator {
	
	static  int sum,sub,mul,div;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int addition = add(10,20);
		System.out.println(addition);
		
		Arithmetic_Calculator ac = new Arithmetic_Calculator();
		int subtract = ac.subtraction(50, 30);
		System.out.println(subtract);
		
		ac.multi(5,4);
	}

	public static final int add(int no1, int no2)
	{
		sum = no1 + no2;
		return sum;
	}
	
	final int subtraction(int no1, int no2)
	{
		sub = no1 - no2;
		return sub;
	}
	final void multi(int no1, int no2)
	{
		mul = no1 * no2;
		System.out.println(mul);
		
	}
};
