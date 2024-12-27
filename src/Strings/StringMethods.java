package Strings;

public class StringMethods {

	public static void main(String[] args) {
		// Strings are reference data types which can store two or more characters.
		// they have access to useful methods  
		String name = "Hailemeskel";
		
//		boolean result ;
//		result = name.equals("hailemeskel"); // output : false
//		result = name.equalsIgnoreCase("hailemeskel"); // output: true
		int length = name.length();
		char character = name.charAt(5);
		int response = name.indexOf('s');
//		String result = name.toLowerCase();
//		String result = name.toUpperCase();
//		name.trim();
//		name.replace('m', "G");
		boolean result = name.isEmpty();
//		name.isBlank();		
		
		System.out.println();
		
		
		
		System.out.println(result);

	}

}
