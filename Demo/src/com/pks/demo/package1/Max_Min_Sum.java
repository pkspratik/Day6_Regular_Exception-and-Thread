package com.pks.demo.package1;

public class Max_Min_Sum {

	
	int max(int no1 , int no2)
	{
		if(no1>no2)
		{
		return no1;
		}
		else if(no1== no2)
		{
			
			System.out.println("Both are Same No");
			return 0;
		}
		else {
			return no2;
		}
	}
	
	int min(int no1 , int no2)
	{
		if(no1>no2)
		{
		return no2;
		}
		else if(no1== no2)
		{
			
			System.out.println("Both are Same No");
			return 0;
		}
		else {
			return no1;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Max_Min_Sum mms = new Max_Min_Sum();
		int n=mms.max(10,12);
		int no=mms.min(11,1);
		System.out.println("Max No is "+n);
		System.out.println("Min No is "+no);
		
		int x[]= {1,2,3,4,5};
		
		 mms.total(x);
		//System.out.println(f);

	}
	
	void total(int a[])
	{
		int temp =0;
		
		for(int b:a) {
			temp = temp +b;
		}
		System.out.println("Sum of Array is "+temp);
		
		
		
		
	}

}
