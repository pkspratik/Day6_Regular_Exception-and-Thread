
package com.pks.demo.package1;
import java.util.Scanner;
public class Test_Iota {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.print("Enter No  => ");
       Scanner sc = new Scanner(System.in);
       int no = sc.nextInt();
       
       int i_no=1;
       
       for(int i=1; i<=no; i++)
       {
    	 i_no = i_no*i;
    	  
       }
		System.out.println(no+" of Iota Value is => "+i_no);
	}

}
