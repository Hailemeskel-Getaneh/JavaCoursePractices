package BasicsOfJava;
public class floatingNumber {

	public static void main(String[] args) {
		
		float num = 3.14f;
		
		int integerPart = (int)num;
		System.out.println("The integer part of : " + num + " is " + integerPart);
		
		float floatingPart = num - integerPart;	
		System.out.println("The floating part of : " + num + " is " + floatingPart);
	
		
	}

}
