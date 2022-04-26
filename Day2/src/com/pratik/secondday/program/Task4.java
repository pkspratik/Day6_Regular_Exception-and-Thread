package com.pratik.secondday.program;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int count= 1;
		
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=5; j++)
			{
				if(count>9)
				{
					System.out.print(count +" ");
				}
				else
				{
					
						System.out.print("0"+count +" ");
					
				}
				
				count++;
			}
			System.out.println();
		}
	}

}
