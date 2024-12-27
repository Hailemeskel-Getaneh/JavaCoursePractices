package classWithMethods;
import java.util.Scanner;

public class Cat {
	
	String name;
	int age;
	
	Cat(){
			age = 5;
			name = "unknown";
	}
	
	String name () {
		return name;
	}
	
	int age() {
		return age;
	}

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
       Cat cat1 = new Cat();
    
    System.out.println("My Cat's Name :" + cat1.name());
    System.out.println("My Cat's age : "+ cat1.age());
    
	}

}
