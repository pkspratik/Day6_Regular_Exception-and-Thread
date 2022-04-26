package com.simplilern.day3.package3;

public class Typecast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Implilicit Casting");
		
		byte b= 100;
		int c = b;
		
		System.out.println("Byte "+b+" Byte to int "+ b);
		
		char a= 'A';
		int d = a;
		
		System.out.println("char "+a+" Char to int "+ d);
		
		float f= 100.20f;
		double e = f;
		
		System.out.println("Float "+f+" float to double "+ e);
		
		System.out.println();
		
		System.out.println("Explilicit Casting");
		double dou = 20.765;
		int no = (int)dou;
		System.out.println("Double "+dou +" Double to int "+ no);
		
		long l = 1000678;
		byte no1 = (byte)l;
		System.out.println("Long "+l+" long to byte "+ no1);
		
	}

}
