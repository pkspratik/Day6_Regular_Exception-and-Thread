package package1;

public class Access_Modifire_Test {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Second amt = new Second();
		
		System.out.println("Default "+amt.a);
		System.out.println("public "+amt.a);
		System.out.println("protected "+amt.a);
		System.out.println("private "+amt.a);

	}

}

class Second{
	
	int a = 10;
	public int b= 20;
	protected int c=30;
	private int d = 40;
}
