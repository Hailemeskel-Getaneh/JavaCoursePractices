package BasicsOfJava;

public class MathMethods {

	public static void main(String[] args) {
		
		// here are some of the math methods to do
		double x = 3.14;
		int z = 64;
		double y = -14;
		System.out.println("absolute value of " + y + " is " + Math.abs(y));
		System.out.println("The square root of " + z + " is " + Math.sqrt(z));
		System.out.println("The round of " + x + " is " + Math.round(x));
		System.out.println("The ceil of " + x + " is " + Math.ceil(x));
		System.out.println("The floor of " + x + " is " + Math.floor(x));
		//NB. Math.max and Math.min works only for the same data types;
		System.out.println("The maximum of " + y + " and " + x  +" is " + Math.max(x,y));
		System.out.println("The minimum of " + y + " and " + x  +" is " + Math.min(x,y));
		
	

	}

}
