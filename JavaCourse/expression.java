package BasicsOfJava;
import java.util.Scanner;

public class expression {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		 //expression is a combination of operands and operators
		// operators are either of +, -, * , / or %
		// operands are values or quantities or others
		
		int x , y, sum = 0, diff, product;
		float quetient = 01;
		System.out.println("Enter the first number: ");
		x = scanner.nextInt();
		System.out.println("Enter the second number: ");
		y = scanner.nextInt();
		
		sum = x + y; diff = x - y; product = x * y; 
		
		System.out.println("sum : "+ sum);
		System.out.println("difference : "+ diff);
		System.out.println("Product : "+ product);
		
		if(y != 0) {
			System.out.println("quetient : "+ quetient);
		}
		else
		{
			System.out.println("quetient : cannot devide a number by zero") ;
		}
		
	System.out.println("increamented x = " + ++x);
	System.out.println("Decreamented y = " + --y);

	}

}
