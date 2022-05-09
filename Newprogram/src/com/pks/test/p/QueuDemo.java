package com.pks.test.p;
import java.util.*;
public class QueuDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		PriorityQueue<String> qu = new PriorityQueue<String>();
		
		qu.add("Person1");
		qu.add("Person2");
		qu.add("Person3");
		qu.add("Person4");
		
		System.out.println(qu);
		
		qu.offer("Person5");
		
		System.out.println(qu);
		
		qu.poll(); //this method for remove first element
		System.out.println(qu);
		
		qu.remove();
	     System.out.println(qu);	
	     
	     Iterator itr = qu.iterator();
	     
	     while(itr.hasNext())
	     {
	    	 System.out.println(itr.next());
	     }
	}

}
