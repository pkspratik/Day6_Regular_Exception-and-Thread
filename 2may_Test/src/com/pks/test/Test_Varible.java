package com.pks.test;

public class Test_Varible {
	
	int a=20;    // instance variable    access 2 way by obj ref and obj
	static int b=30; // static variable    access 4 way by direct or class name obj ref and obj

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int a= 50; // local variable   access 1 directly
         
         new Test_Varible(); // obj 1
         Test_Varible obj   = new Test_Varible(); // obj ref 2
         
         System.out.println(a);   // 50
         System.out.println(obj.a);   //20
         System.out.println(b);
         System.out.println(Test_Varible.b);
         System.out.println(new Test_Varible().b);
         System.out.println(obj.b);
         
         
         
         //obj.print();
         
	}
	
	void print() {
		System.out.println(a);//  hide
		System.out.println(this.a); // this, this(), this(20,30)
	}

}
