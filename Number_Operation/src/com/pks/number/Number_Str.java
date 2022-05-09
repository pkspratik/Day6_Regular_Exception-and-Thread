package com.pks.number;

public class Number_Str {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int no = 1234;
		
		String str = Integer.toString(no);
		
		int no1 = Integer.valueOf(str);
		System.out.println(no1);
		
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());
		
	}

}
