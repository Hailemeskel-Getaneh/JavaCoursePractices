package classWithMethods;
import java.util.Scanner;


public class Account {
	
	public String accountNumber;
	public float balance;
	
   Account(String AccountNumber, float Balance){
	   if(AccountNumber.isEmpty() || AccountNumber == null) {
			System.out.println("Account number can not be empy or null");
		}
	   else {
		   accountNumber = AccountNumber;
	   }
	   
	   
	   if(Balance < 0) {
		   System.out.println("balance must be positive");
	   }
	   
	   else {
		   balance = Balance;
	   }
		
   }
	
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the account number :");
		String accountNo = scanner.nextLine();
		
		System.out.println("Enter the account balance:");
		float balance = scanner.nextFloat();
		
		Account a = new Account(accountNo, balance);
		

	}

}
