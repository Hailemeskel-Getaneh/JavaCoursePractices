package LoopsInJava;
import java.util.Scanner;

public class forLoop {

	public static void main(String[] args) {
		// for loop executes for limited amount of time
		Scanner scanner = new Scanner(System.in);
		int rows , columns ;
		String symbol;
		
		for(int i = 1; i<=3; i++) {
			System.out.println("I love Marti too much");
		}
		// let us do a nested loops
		System.out.println("Enter # of rows :");
		rows = scanner.nextInt();
		System.out.println("Enter the # of columns :");
		columns = scanner.nextInt();
		System.out.println("Enter the symbol you want :");
		symbol = scanner.next();
		
		for(int i = 1; i<= rows ; i++) {
			System.out.print(" " + symbol);
			for(int j = 1; j <= columns; j++) {
				System.out.print(" " + symbol);
			}
			String space = " ";
			System.out.println();
			
		}
     /* i = 1, j + 1 j = 0 , j= j+2
      * 6 -i  6 - j
      *12345M123456M
      *1234M1M1234M1M
      *123M123M12M123M
       12M12345M12345M
       1M1234567891234M
      * 
      * 
      * 
      */
		
	

	}

}
