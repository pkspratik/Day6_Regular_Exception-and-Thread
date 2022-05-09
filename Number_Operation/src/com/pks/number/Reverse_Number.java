package com.pks.number;
import java.util.*;
public class Reverse_Number {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int rev =0 ;
		
		System.out.print("Enter Number For Reverse ");
		
		//String s ="4321";
		
		int a = sc.nextInt();
		
		while(a!=0)
		{
			int rem = a % 10;
			rev =rev*10 +rem;
			a=a/10;
			
		}
		
		System.out.println("After reverse => "+rev);
		
		
		System.out.println();
		System.out.println("If you want to reverce of String then press Yes or No ");
		
		String stri = sc.next();
		
		if(stri.equals("Yes"))
		{
			System.out.println();
			System.out.print("Enter String => ");
			String str = sc.next();
			
			StringBuffer sb = new StringBuffer(str);
			System.out.println("After Reverse => "+sb.reverse());
		}
		else if(stri.equals("No")){
			System.out.println("Okay ");
		}
		else {
			System.out.println("Enter Valid String Try again");
		}
		
		Reverse_Number rn = new Reverse_Number();
	//	rn.reverse("PKS");
		

	}
	
	void reverse(String str)
	{
		StringBuffer sb = new StringBuffer(str);
		
		System.out.println(sb.reverse());
	}

}
