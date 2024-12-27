package BasicsOfJava;
import java.util.Scanner;

public class ifStatement {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// in if statement you should outlook the order of the conditions. the order really matters
	System.out.println("Enter your age :");
		int age = scanner.nextInt();
		scanner.close();
		
		if(age >= 75) {
			System.out.println("You are too adult");
		}
		else if(age > 40) {
			System.out.println("You are medium adult");
		}
		
		else if( age > 18) {
			System.out.println("You are a younger man");
		}
		
		else{
			System.out.print("You are a child ");
		}
	

	}

}
