package classWithMethods;

class college{
	 public void move() {
		 System.out.println("college is open");
	 }
}

class university extends college{
	public void move() {
		System.out.println("University is open");
	}
}


public class methodeOverriding {

	public static void main(String[] args) {
		
		
//		university a = new college(); 
		// this is type mismatch that mean cannot university to college
		college b = new university();
		
//		a.move();
		
		b.move();

	}

}
