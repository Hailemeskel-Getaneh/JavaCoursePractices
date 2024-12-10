package BasicsOfJava;
import java.util.Scanner;
import java.util.Random;
public class LogicalOPerators {

	public static void main(String[] args) {
		// There are three main logical operators.
		// These are the && , || and !.
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		System.out.println("Enter Q or q to exit the game");
		
		String response = scanner.next();
		if(response.equals("Q") || response.equals("q")) {
			System.out.println("You quite the game");
			
		}
		
		else {
			
			int secretNumber = random.nextInt(11);
			System.out.println("Enter your guest between 0 and 10");
			int gues = scanner.nextInt();
			
			System.out.println("You are still playing the game");
			if(gues == secretNumber) {
				System.out.println("You got it");
			}
			
			else if(gues < 5 && gues % 2 == 0) {
				System.out.println("incorrect gues. Your gues is even and less than 5.");
			}
			
			else if(gues >= 5 && gues % 2 == 0) {
				System.out.println("incorrect gues. Your gues is even and greater than 5.");
			}
			else if(gues < 5 && gues % 2 != 0) {
				System.out.println("incorrect gues. Your gues is odd and less than 5.");
			}
			
			else if(gues > 5 && gues % 2 != 0) {
				System.out.println("incorrect gues. Your gues is odd and greater than 5.");
			}
			
		}	
			
		scanner.close();

	}

}
