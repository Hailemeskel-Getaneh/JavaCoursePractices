package BasicsOfJava;

public class casting {

	public static void main(String[] args) {
		/*There are two types of casting:
		-->Implicit casting: widening from the narrower to wider range
		     -- here it is possible from numerics to numerics from smaller to larger
		     -- byte --> short --> char --> int --> long --> float  ---> double
		  
	   --> explicit casting : is narrowing from higher range to lower range
	       -- Double --> Float --> Long --> Int --> char --> short --> Byte
		
*/
		
		// implicit casting
			int num = 34;
			float x = num;
			double y = x;
			System.out.println(num);
			System.out.println(y);
			
		
		//explicit casting
			double myNum = 3.253;
			int z = (int) myNum;
			
			System.out.println(myNum);
			System.out.println(z);
		
		
	}

}
