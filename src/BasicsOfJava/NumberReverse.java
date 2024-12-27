package BasicsOfJava;
import java.util.Scanner;
public class NumberReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a two or more digit number :");
		Integer Number = scanner.nextInt();//use wrapper class data type
		if(Number <10 && Number >=0) {
			System.out.println("It must be more than two digit");
		
		}

		else {
		      
		      
		      int length = Number.toString().length();
		      
	
		      int reversed = 0;
		       while ( length > 0) {
		           int digit = Number % 10; 
		           reversed = reversed * 10 + digit;
		             
		           Number = Number / 10;   
		           length--;
		       }
		       System.out.println(reversed);
		}
       
		scanner.close();

	}

}
