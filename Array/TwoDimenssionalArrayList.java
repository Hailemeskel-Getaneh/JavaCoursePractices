package Array;
import java.util.ArrayList;

public class TwoDimenssionalArrayList {

	public static void main(String[] args) {
		// This is array list of array list
		 //declare 2D arrayList
		
		ArrayList<ArrayList<String>> users = new ArrayList();
		
		
		// create arrayList of students
		ArrayList<String> students = new ArrayList();
		
		students.add("Hailemeskel Getaneh");
		students.add("Martemuz Zemedkun");
		students.add("Demissew Getachew");
		
		
		// create arrayList of teachers
		ArrayList<String> teachers = new ArrayList();
		 
		teachers.add("Wendmagegn");
		teachers.add("Hailemariam");
		teachers.add("Kochew Abebe");
		
		
		// Then add the 1D array lists to the 2D array list
		
		users.add(students);
		users.add(teachers);
		
	// Display the 2D arrayList using loop
		
		for(int i = 0; i < users.size(); i++) {
			
			for(int j = 0; j < users.get(i).size(); j++) {
				System.out.println( users.get(i).get(j));
			}
			
		}
		
		
		
		
		

	}

}
