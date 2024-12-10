package methodsInJava;
import java.util.Scanner;
public class firstMethodExample {

	public static void main(String[] args) {
		// method is a code executed when it is called up on.
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your name");
		String name = scanner.nextLine();
		
		System.out.println("Enter your age :");
		int age = scanner.nextInt();
		
		greeting(name, age);
		
	}
	
	// use static key word since it is called in the static method called main.
	// void does not have a return type
	
	static void greeting(String name, int age) {
		
		System.out.println("Hello " + name);
		System.out.println("You are " + age + " years old");
	}

}
