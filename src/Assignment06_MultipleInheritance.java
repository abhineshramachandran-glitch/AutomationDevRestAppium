
// Creating first interface
interface father {
	void show();	
}
//Creating second interface
interface mother {
	void display();
}

public class Assignment06_MultipleInheritance {
	
	// Implementing method from Father interface
	public void show() {
		System.out.println("This is father method");
	}
	
	// Implementing method from mother interface
	public void display() {
		System.out.println("This is mother method");	
	}
 
	public static void main(String[] args) {

		// Creating object of Assignment06_MultipleInheritance 
		Assignment06_MultipleInheritance obj = new Assignment06_MultipleInheritance();
		
		// Calling both methods
		obj.show();
		obj.display();	
	}

}
