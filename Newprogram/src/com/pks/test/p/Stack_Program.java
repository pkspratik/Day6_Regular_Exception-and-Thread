package com.pks.test.p;
import java.util.Stack;
import java.util.Scanner;
public class Stack_Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<String> st = new Stack<String>();
		
		st.push("one");
		st.push("two");
		st.push("three");
		st.push("four");
		st.push("five");
		
		System.out.println(st);
		
		Scanner sc = new Scanner(System.in);
		String user_inp = sc.next();
		
		if(st.search(user_inp) != -1)
		{
			System.out.println("Stack is Exist");
		}
		else {
			System.out.println("Note Found ");
		}
		
		System.out.println("Last element is "+st.peek());
		st.pop();
		st.pop();
		System.out.println("Stack is  "+st);
		
		while(! st.empty()) {
			st.pop();
			System.out.println(st);
		}
	}

}
