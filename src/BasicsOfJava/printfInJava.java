package BasicsOfJava;

public class printfInJava {

	public static void main(String[] args) {
		// Printf - is an optional method to control, format and display text in the terminal
		// it has two parts - string format + object/ variable or value
		// % [flags] [precision][width][conversion character]
		
		System.out.printf("I am %d years old", 22);
		
		boolean myBoolean = true;
		String name = "Hailemeskel";
		int myNum = 21;
		double myFraction = 44.32;
		char myLetter = 'M';
		
		System.out.printf("%b", myBoolean);
		System.out.printf("%s", name);
		System.out.printf("%d", myNum);
		System.out.printf("%f", myFraction);
		System.out.printf("%c", myLetter);
		
		
	
	}

}
