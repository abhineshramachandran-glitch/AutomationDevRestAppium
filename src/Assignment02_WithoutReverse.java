
public class Assignment02_WithoutReverse {

	public static void main(String[] args) {

		
		// Original string
		String str = "Automation";
		
		// Empty string to store the reversed result
		String rev = "";
		
		
		// Loop starts from the last character of the string
        // str.length()-1 gives the last index
		for(int i = str.length()-1; i >= 0; i--) {
			
			// charAt(i) extracts each character
            // Characters are added one by one in reverse order
			rev = rev + str.charAt(i);
			
			// printing the reversed string
			System.out.println("Reversed String: "+ rev);
			
		}
	}

}
