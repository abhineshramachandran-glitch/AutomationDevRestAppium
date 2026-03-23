import java.util.ArrayList;
import java.util.Collections;

public class Assignment05_SortArrayList {

	public static void main(String[] args) {

		
		// Creating an ArrayList to store integer values
		ArrayList<Integer> list = new ArrayList<>();
		
		// Adding numbers to the list
		list.add(5);
		list.add(4);
		list.add(10);
		list.add(7);
		list.add(1);
		list.add(3);
		list.add(9);
		list.add(2);
		list.add(8);
		list.add(6);
		
		// Collections.sort() sorts the list in ascending order
		Collections.sort(list);
		
		System.out.println("Sorted List: "+ list);
	}

}
