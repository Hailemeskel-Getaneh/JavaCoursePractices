package classWithMethods;

	class Animal {
		
		public void makeSound() {
			System.out.println("Animals can make sound");
		}
	}


	class Cats extends Animal{
				
			public void makeSound() {
				
				System.out.println("cats can make sound");
			}
				
	
	}

public class methodeOverriding2 {

	public static void main(String[] args) {
		
		Animal animal = new Cats();
//		Cats a = new Animal(); //  object of cats or a cannot be called to the parent class Animal 
		
		animal.makeSound(); //method overriding: access the child class method, not the parent one

		
		
	}

}
