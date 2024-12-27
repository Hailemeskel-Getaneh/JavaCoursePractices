package methodsInJava;

public class overLoadedMethods {

	public static void main(String[] args) {
		// Overloaded methods are methods that have the same name but different
		// number of parameters or different in data type
		
		System.out.println(sum(1,3));
		System.out.println(sum(1,3,8));
		System.out.println(sum(1,3,9,43));
		System.out.println(sum(1.6,3.3));
		System.out.println(sum(13.45,37.8, 4.44));
		System.out.println(sum(1.9,3.8,5.6, 7.2));
	

	}
	
	static int sum(int a, int b) {
		System.out.println("This is overloaded method #1");
		return a + b;
	}
	
	static int sum(int a, int b, int c) {
		System.out.println("This is overloaded method #2");
		return a + b + c;
	}
	
	static int sum(int a, int b, int c, int d) {
		System.out.println("This is overloaded method #3");
		return a + b;
	}
	
	static double sum(double a, double b) {
		System.out.println("This is overloaded method #4");
		return a + b;
	}
	static double sum(double a, double b, double c) {
		System.out.println("This is overloaded method #5");
		return a + b + c;
	}
	
	static double sum(double a, double b,double c, double d) {
		System.out.println("This is overloaded method #1");
		return a + b + c + d;
	}

}
