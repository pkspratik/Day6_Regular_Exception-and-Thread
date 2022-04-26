package com.simplilern.day3.package3;
class privateModiFiere
{
 private void display()
 {
	 System.out.println("  Private Access ");	
	
 }
}


class defaultModiFiere
{
  void display()
 {
	 System.out.println(" Default Access ");	
	
 }
}

 class protectedModiFiere
 {
  protected void display()
  {
 	 System.out.println("  Protected Access ");	
 	
  }
 }
 
 class publicdModiFiere
 {
  public void display()
  {
 	 System.out.println("  Public Access ");	
 	
  }
 }
 
public class AccessModifier2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		privateModiFiere pma = new privateModiFiere();
		System.out.println("private Modifier ");
		//pma.display();
		
		defaultModiFiere df = new defaultModiFiere();
		System.out.println("Defult Modifier ");
		df.display();
		
		protectedModiFiere prom = new protectedModiFiere();
		System.out.println("Protected Modifier");
		prom.display();
		
		publicdModiFiere pmf = new publicdModiFiere();
		pmf.display();
		
	}

}
