
public class test_abs extends Test_abstract implements Test_interface {

	public static void main(String[] args) {
		System.out.println("Executing main");
		display();		
		
		Test_abstract abst = new test_abs();
		abst.drive();		
	}
	
	
	public test_abs() {
		super();		
	}


	public static void display(){
		System.out.println("displaying");
	}


	@Override
	public void starting() {
		System.out.println("Starting");
	}
	
	@Override
	public void drive() { System.out.println("Driving from within Main"); }
	 
}
