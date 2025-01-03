package classWithMethods;
import java.util.Scanner;

class Shape{
	
	void getParameter(int radius) {
		
		    double parameter = 2 * Math.PI * radius;
	     	System.out.println("parameter of the shape is :" + parameter);
		}
	
	void getArea(int radius){
		 
    	double area =  Math.PI * Math.pow(radius, 2);
	    	System.out.println("Area of the Shape is :" + area);
    	}
 }

class Circle extends Shape{
	
	void getParameter(int radius) {
		
				double parameter = 2 * Math.PI * radius;
				System.out.println("Prameter of the circle is :" + parameter);
				
			}
	
	void getArea(int radius){
		
	    	double area = Math.PI * Math.pow(radius, 2);
		    System.out.println("Area of the circle is :" + area);
	      }
	
}

public class methodOverriding3 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the radius of the shae");
		int radius = s.nextInt();
		
		Shape shape1 = new Circle();
		
		shape1.getParameter(radius);
		shape1.getArea(radius);
		

	}

}
