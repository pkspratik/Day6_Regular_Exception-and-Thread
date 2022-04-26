class PrivAccessSpacifire{
	
	private void display() {
        System.out.println("You are using private access specifier"); 
	}
}
public class AccessSpacifire2 {

	private void display() {
        System.out.println("You are using private access specifier in same class"); 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//private
				System.out.println("Private Access Specifier");
				PrivAccessSpacifire  obj = new PrivAccessSpacifire(); 
		        //trying to access private method of another class 
		        //obj.display();
				
				AccessSpacifire2 as = new AccessSpacifire2(); // only we can access private method in same class
				as.display();
				
                 
	}

}
