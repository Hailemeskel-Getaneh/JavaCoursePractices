package LoopsInJava;
import java.util.Scanner;

public class whileLoop {

	public static void main(String[] args) {
		// while loop : executes something inside it until the condition is false

		Scanner scanner = new Scanner(System.in);
		String name = "";
		while(name.isBlank()) {
			System.out.print("Then name field is required. Enter your name : ");
			name = scanner.nextLine();
		}
		
		//stays in the while loop if the name is empty.
		
		System.out.println("Hello " + name);
		
		
	}

}
