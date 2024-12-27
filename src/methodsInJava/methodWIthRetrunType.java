package methodsInJava;
import java.util.Scanner;

class methodWIthRetrunType {

	public static void main(String[] args) {
		//This is method with return 
		
		Scanner scanner = new Scanner(System.in);
		
		
		int x, y, sum ;
		System.out.println("Enter the first number :");
		x = scanner.nextInt();
//	       scanner.nextLine();		
	       
       System.out.println("Enter the second number :");
		y = scanner.nextInt();
		 
		
		sum = sum(x, y);

		
		System.out.println("sum of " + x + " and " + y + " is " + sum);
		System.out.println("product of " + x + " and " + y + " is " + product(x, y));
	

	}
	
	static int sum (int x, int y) {
		
		int sum = 0;
		sum = x + y ;
		return sum;
	}
	
	static int product(int x, int y) {
		
		return x * y ;
	}
	

}
