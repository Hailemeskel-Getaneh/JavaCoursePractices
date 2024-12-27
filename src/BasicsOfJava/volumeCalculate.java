package BasicsOfJava;

class calculate{
	 double height, length, width;
 
	 
	 calculate(double w, double l , double h){
		 height = h;
		 width = w;
		 length = l;
		 
		 System.out.println(height * length * width);
	 }
	 
	 calculate(double w, double l ){
		
		 width = w;
		 length = l;
		 
		 System.out.println( length * width);
	 }
	 
	
	
}

public class volumeCalculate {

	public static void main(String[] args) {
		// calculate volume
		
//		calculate x = new calculate(3, 4,5);
		calculate y = new calculate(3, 4);

	}

}
