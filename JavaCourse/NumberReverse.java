import java.util.Scanner;
public class NumberReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a two or more digit number :");
		int Number = scanner.nextInt();
		if(Number <10 && Number >=0) {
			System.out.println("It must be more than two digit");
		
		}

		else {
		      
		       String reversed = "";
		       while (Number > 0) {
		           int digit = Number % 10; 
		           reversed += digit;
		             
		           Number = Number / 10;           
		       }
		       System.out.println(reversed);
		}
       
		scanner.close();

	}

}
