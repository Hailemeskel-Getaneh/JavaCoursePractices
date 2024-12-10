import java.util.Scanner;

public class SpyNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number to check if it's a Spy Number: ");
        int Number = scanner.nextInt();


        int sum = 0, product = 1;

        
        int i = Number;
        
        while (Number > 0) {
            int digit = Number % 10; 
            sum += digit;
            product *= digit;     
            Number = Number / 10;           
        }


        if (sum == product) {
            System.out.println(i + " is a Spy Number.");
        } else {
            System.out.println(i + " is not a Spy Number.");
        }

        scanner.close();
    }
}
