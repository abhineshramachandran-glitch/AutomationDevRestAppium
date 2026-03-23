
public class Assignment03_PrimeNumbers {

	public static void main(String[] args) {

		
		// Loop through numbers from 1 to 100
		for (int no=1; no<=100; no++) {
			
			int count=0; // variable to count factors
		
		// Loop to check how many numbers divide the current number	
		for(int i=1; i<= no; i++) {
			
			// If no is divisible by i
			if (no % i == 0) {	
				count++;  // increase factor count
			}
		}
		// Prime numbers have exactly 2 factors (1 and itself)
		  if(count ==2) {
			  System.out.println(no);
		  }
		}
	}

}
