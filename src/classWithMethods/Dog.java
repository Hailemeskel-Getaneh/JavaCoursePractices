package classWithMethods;
import java.util.Scanner;

public class Dog {
	
   public	String name;
	public String color;
	
	Dog (String dogName, String Color){
		name = dogName;
		color = Color;
	}
	
	
		String color() {
				return color;
			}

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the name of the Dog : ");
		String name = s.nextLine();
		
		System.out.println("Enter the color of the Dog : ");
		String color = s.nextLine();
		
		Dog myDog = new Dog(name, color);
		
		System.out.println(" name of the Dog : " + myDog.name);
		System.out.println(" color of the Dog : " + myDog.color());
		
		s.close();
	}

}
