package com.simplilern.day3.package3;

class Car
{

	String company;
	String color;
	long prise;
	
	
	void speed() {
		System.out.println("Car Speed 220 kh ");
	}
	void issue()
	{
		System.out.println("Some problem in Car");
	}
	
}
public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car c = new Car();
		c.company="Mahindra Scripo";
		c.color="Black";
		c.prise=1800000;
		
		System.out.println("Company Name "+c.company);
		System.out.println("Car Color "+c.color);
		System.out.println(" Prise "+c.prise);
		
		
		c.speed();
		c.issue();
	}

}
