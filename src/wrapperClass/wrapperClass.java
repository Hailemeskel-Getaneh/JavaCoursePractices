package wrapperClass;

public class wrapperClass {

	public static void main(String[] args) {
	
// wrapper class is a way of using primitive data types as reference data types.
//		reference data types have access to useful methods
//      can be used with collections (example ArrayList)
		
		
		/* autoboxing : is automatic conversion that java compilers do from 
		 primitive data type to reference data types.
		 
		 unboxing : is the reverse of autoboxig.
		 
		 let use declare some variables using wrapper class
		 */
		
		
		Boolean is_enrolled = true;
		Integer num = 12324324;
		Character letter = 'M';
		Double x = 432.33;
		String name = "Hailemeskel";
		
		String number = num.toString(); // change the number to string
		System.out.println(number.charAt(2));
		System.out.println(number.length());
		name.strip();//remove
		
//		 num = name.split(0, number.length()/2);
		 System.out.println();
		 
      
		 
		 
		
		

	}

}
