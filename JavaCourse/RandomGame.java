package BasicsOfJava;
import java.util.Random;
import javax.swing.JOptionPane;
//import java.util.Scanner;
public class RandomGame {

	public static void main(String[] args) {
		// random number game
		
		Random random = new Random();
		
		int secretNumber = random.nextInt(10) + 1;
		int x = 1;
		
//		JOptionPane.showMessageDialog(null, secretNumber);
		
		while( x <= 5) {
			
			int guess = Integer.parseInt(JOptionPane.showInputDialog("Enter your guess :"));
			
			if(guess < 1 || guess > 10) {
				
				JOptionPane.showMessageDialog(null, "Your guess should be between 1 and 10");	
			}
			else {
				
				if(guess == secretNumber) {
				
					JOptionPane.showMessageDialog(null, "Congra!! you got it.");
					break;
				}
				
				else if( guess < secretNumber) {
					JOptionPane.showMessageDialog(null, "Your guess is smaller");
				}
				
				else {

					JOptionPane.showMessageDialog(null, "your guess is larger");
				}
			}
			
			x = x +1;
			
			if(x == 6) {
				JOptionPane.showMessageDialog(null, "Game over!");
				break;
			}
			
		}
		

		
//		scanner.close();
		

	}

}
