package com.pks.test.p;
import java.util.*;
 class StudentRecordSort implements Comparable {
	String name;
	int roll_no;
	String address;
	
	StudentRecordSort(String name, int roll,String address)
	{
		this.name=name;
		this.roll_no=roll;
		this.address=address;
	}
	
	

	public String toString() {
		return this.roll_no + " "+this.name +" "+this.address ;
	}
	
public int compareTo(Object o) {
	return this.roll_no-((StudentRecordSort)o).roll_no;	
	}

}
public class StudentRecord
{
public static void main(String args[])
{

	
	
	List stu = new ArrayList();
	stu.add(new StudentRecordSort("Vikram",005,"Jaipur"));
	stu.add(new StudentRecordSort("Vipul",035,"Banglor"));
	stu.add(new StudentRecordSort("Subash",001,"Bihar"));
	
	Collections.sort(stu);
	
	System.out.println("After Shorting RollNo");
	
	for(int i=0; i<stu.size();  i++) {
		System.out.println(stu.get(i));
	}
	
}
}
