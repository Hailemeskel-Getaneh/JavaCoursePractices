package BasicsOfJava;

public class sampleOperator {
	public static void main(String[] args) {
		
		boolean a = true;
		boolean b = false;
		
		
		boolean result1 = a && b;
		boolean result2 = a || b;
		
		boolean negation = !b;
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(negation);
		
		if(a) {
			System.out.println("Something is done in the system");
		}
		
	}

}
