
public class Assignment05_NullException {

	@SuppressWarnings("null")
	public static void main(String[] args) {

		
		try {
			// String variable declared but not initialized with any value
			String str = null;
			
			// Trying to use length() method on null string
            // This will cause NullPointerException
			System.out.println(str.length());
			
		}
		
		// Catch block handles the exception
		catch (NullPointerException e) {
			System.out.println("Null pointer exception handled");

		}
	}

}
