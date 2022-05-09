package com.pks.test.p;

public class Box {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		for(int i=0; i<=5; i++)
		{
			for(int j=0; j<=10; j++)
			{
				
				if(i==0 || i==5  || j==0 || j==10 )
				{
				System.out.print("*" +" " );
				
				}
				else if(i== 2 && j==2)
				{
					System.out.print("p" +" ");
				}
				else if(i== 2 && j==4)
				{
					System.out.print("." +" ");
				}
				else if(i== 2 && j==6)
				{
					System.out.print("S" +" ");
				}
				else
				{
					System.out.print(" " + " ");
				}
				
			}
			
			System.out.println();
		}
		
	}

}
