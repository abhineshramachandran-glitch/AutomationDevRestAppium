
public class Assignment04_ArrayException {

	public static void main(String[] args) {

		try {
			
			// Creating an array with 3 elements
			int arr[] = {10,20,30};
				
			// Trying to access an index that does not exist
            // Array index starts from 0 so valid indexes are 0,1,2
			System.out.println(arr[5]);
	
		}
	
		// Catch block handles the exception
		catch (ArrayIndexOutOfBoundsException e) {
			
			// Displaying a message instead of crashing the program
			System.out.println("Array index is out of bound");
		}
	}

}
