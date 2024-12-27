package BasicsOfJava;
import java.util.Scanner;

public class HypotanesCalculate {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the x side of the triangle :");
		double x = scanner.nextDouble();
		System.out.println("Enter the y side of the trianle :");
		double y = scanner.nextDouble();

		
		double hypotenuse = Math.hypot(x, y); // or hypotenuse = Math.sqrt((x * x) + (y + y))
		System.out.println(hypotenuse);
		
		scanner.close(); // best practice to close the scanner
		
		

	}

}
