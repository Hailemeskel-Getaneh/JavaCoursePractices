package Array;
import java.util.ArrayList;

public class TheArrayList {

	public static void main(String[] args) {
		//* ArrayList is a resizable array;
		//    - Elements can be added and also removed from the list
		//    - But they only store reference data types.
		
		ArrayList<String> students = new ArrayList<String>();
		
		// add element
		students.add("Hailemeskel Getaneh"); 
		students.add("Martemuz Zemedkun");
		students.add("Alememitu Kebede");
		
		// replace element
		
		students.set(2, "Selamawit Ayele");
		
		// remove an element
		  students.remove(2);
		  
		// clear all of the elements
		  
//		  students.clear();
		  
		  if (students.isEmpty()){
			  
			 System.out.println("The array is empty");
		  }
		
		  else
			  {
				  for (int i = 0 ; i < students.size(); i++) {
						System.out.println(students.get(i)); 
				 }
			  }
		
		  // another example using numbers
	
		 ArrayList<Integer> numbers = new ArrayList<Integer>();
		 
		 numbers.add(4);
		 numbers.add(7);
		 numbers.add(8);
		 
		 int sum = 0;
		 
	
		 
	 
		 for (int i = 0; i < numbers.size(); i++) {
			 
//			 sum = sum + numbers.get(i) ;
		 }
		 
		 System.out.println(" Sum of the list : "  + sum);

	}

}
