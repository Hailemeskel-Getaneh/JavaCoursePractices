package BasicsOfJava;
import java.util.Scanner;


public class userInput{

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // create a scanner object
		
		System.out.println("What is  your name :");
		String name;
		name = scanner.nextLine();
		System.out.println("What old are you :");
		int age = scanner.nextInt();
		
		scanner.nextLine(); // it's to remove the problem happening after 
		  // using the nextInt() b/c it takes the integer only and the 
		// \n lefts and impossible to use another nextLine()
		
		System.out.println("What is your fovorite food :");
		String food = scanner.nextLine();
		
		
		System.out.println("Hello " + name + ", welcome Here");
		System.out.println("you like " + food);
		
		if(age > 18) {
			System.out.println("You are eligible for voting");	
		}
		
		else
		{
			System.out.println("You are not eligible for voting");
		}
		
	

	}

}
