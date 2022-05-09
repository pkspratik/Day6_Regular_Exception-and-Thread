package com.pks.test.p;

import java.util.LinkedList;
import java.util.Iterator;

public class Linklist_Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList ll = new LinkedList();
		
		ll.add(10);
		ll.add("three");
		ll.add(20);
		ll.add("two");
		ll.add(30);
		ll.add("One");
		ll.add("two");
		ll.add("three");
		
		System.out.println(ll);
		
		Iterator it = ll.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next() );
		}
		
		it=ll.descendingIterator();
		
		//System.out.println(it);
		
		while(it.hasNext())
		{
			System.out.println(it.next() );
		}
		
		ll.removeFirst();
		System.out.println("Remove first "+ll);
		
		ll.removeLast();
		System.out.println("Last Remove "+ll);
		
		System.out.println();
		ll.removeFirstOccurrence("two"); // same name two place then i need remove first one then use this 
		System.out.println(ll);
		
		System.out.println();
		ll.removeLastOccurrence("three");
		System.out.println(ll);
		
		
		ll.clear();// clear all 
	}

}
