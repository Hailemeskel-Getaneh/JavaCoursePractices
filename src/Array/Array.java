package Array;
import java.util.Scanner;
public class Array {

	public static void main(String[] args) {
		// arrays are used to store multiple values in a single variable.
		// All the data should be the same type
		// They are user defined or reference data types
		
		Scanner scanner = new Scanner(System.in);
		int[] numbers = {1, 2, 4, 6, 7, 8, 9};
		String[] names = {"Haile", "Marti", "Nolawi"};
		String[] students = new String[5];
		
		System.out.println("length of the students array is :" + students.length);
		 numbers[5] = 16;
		System.out.println(numbers[3]);
		System.out.println(numbers[5]);
		System.out.println(names[1]);
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Enter the name of the "+ 1+ "student : " );
			students[i] = scanner.nextLine();
			
		}
		
		for(int i = 0; i < 5; i++) {
			System.out.print(students[i] + ", ");
			
		}
		
	
  
		scanner.close();
	}

}
