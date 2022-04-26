package com.pks.project.package2;
import java.util.Scanner;
public class Quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int enter_no;
		int cont;
		
		while(true) {  // infinate true 
		System.out.println("Who is founder of Computer");
		System.out.println("1. Jems Ghoushleen\n2. Chals Babez\n3. Denious Richid\n4. Mark Gugarburg ");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Please Enter Answer (1/2/3/4) => ");
		enter_no = sc.nextInt();

		if(enter_no == 2)
		{
			System.out.println(" Wright Answer !!");
			
			break ;
		}
		else if(enter_no != 2)
		{
			System.out.println("Sorry You are Wrong");
			System.out.println("if you want to Exit Press 6 !! Other Wise Continue");
			
			cont=sc.nextInt();
			
			if(cont == 6) {
				break ;
			}
			
			
		}
		}
	}

}
