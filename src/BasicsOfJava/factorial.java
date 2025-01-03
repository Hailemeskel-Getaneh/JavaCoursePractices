package BasicsOfJava;
import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a positive number: ");
		int num = scanner.nextInt();		
		double factorial = 1;
		int i = num;
		while(num>0) {
			factorial += factorial * num;
			num--;
		}
		
		System.out.println("The factorial of " + i + " is " + factorial);

		scanner.close();
	}

}
