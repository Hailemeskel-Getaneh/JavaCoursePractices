package BasicsOfJava;
import java.util.Scanner;

public class primeNumber {
	
	static boolean b = false;

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int x = scanner.nextInt();	
			
		for(int i =2 ; i<x ; i++) {
			
			if(x % i == 0) {

				 b = true;
			}
			
		}
		
		if(b) {
			System.out.println("It is composite");
		}
		else {
			System.out.println("It is prime");
		}

	}

}
