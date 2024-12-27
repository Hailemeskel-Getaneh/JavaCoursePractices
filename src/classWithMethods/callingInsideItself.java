package classWithMethods;

public class callingInsideItself {

	int age;
	callingInsideItself(){
		 age = 5;
	}
	
	
	  String name;
	 void  callingInsideItselfe(){
		  
		  System.out.println(name + age);
	  }
	  
	  
	public static void main(String[] args) {
		// 
		callingInsideItself obj1 = new callingInsideItself();
	
	System.out.println(obj1.age);	
	}

}
