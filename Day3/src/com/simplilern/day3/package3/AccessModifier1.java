package com.simplilern.day3.package3;
class DefAccessModifier
{
void display()
{
System.out.println(" This is Default Access Modifier");	
}
}
public class AccessModifier1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Default ");
		
		DefAccessModifier dam = new DefAccessModifier();
		dam.display();
	}

}
