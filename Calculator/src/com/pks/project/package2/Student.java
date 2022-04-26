package com.pks.project.package2;

class MainStudent{
	int regNumber;
	String stuName;
	
	MainStudent(int r_no , String s_name)
	{
		this.regNumber=r_no;
		this.stuName=s_name;
	}
}
public class Student {
public static void main(String args[])
{
MainStudent[] arr ;
arr = new MainStudent[5];

arr[0] = new MainStudent(1234, "Munna");
arr[1] = new MainStudent(1235, "Pratik");
arr[2] = new MainStudent(1236, "Ujjwal");
arr[3] = new MainStudent(1237, "Ankit");
arr[4] = new MainStudent(1238, "Sany");

for(int i=0; i<= arr.length; i++)
{
System.out.println(arr[i].regNumber+ " "+ arr[i].stuName);
}

}

}
