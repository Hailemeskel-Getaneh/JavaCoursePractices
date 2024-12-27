package LoopsInJava;
import java.util.ArrayList;

public class forEachLoopInJava {

	public static void main(String[] args) {
		// YOu need to know about array before this course
		
// for-each or enhanced array list are used to iterate over arrays or collections.
		// less steps, more readiable but less flexible
		
		String[] students = {"Hailemeskel", "Marti", "Dagne", "Mekides"};
		
		for(String student: students) {
			System.out.println(student);
		}
		
		System.out.println();
// create a new  array list
		
		ArrayList<String> foods = new ArrayList();
		
		foods.add("injera");
		foods.add("beyeaynet");
		foods.add("Shiro");
		foods.add("pasta be atkilt");
		
		// display the array list using for each loop
		
    for(String food : foods) {
    	
      System.out.println(food);
		}
     
		

	}

}
