
public class Assignment01_WithReverse {

	public static void main(String[] args) {
		

        //Declaring a string variable and storing the word "Automation"
		String str = "Automation";
		

        //StringBuffer class is used because it has a built-in reverse() method
		StringBuffer sb = new StringBuffer(str);
		
        //reverse() method reverses the characters in the string
		sb.reverse();
		
        //Printing the reversed string to the console
		System.out.println("Reversed String: "+ sb);

	}

}
