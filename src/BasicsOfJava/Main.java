package BasicsOfJava;


public class Main {
   static int num = 30;
   
  void myNum(int n) {
	  num = n;
	   System.out.println("My number : " + num);
   }
	public static void main(String[] args) {
		System.out.println("This is myfirst java program");
		System.out.print("This is myfirst java program");
		
		// Using semi colon is mandatory here
		
		/* There  are many data types in java
 		 it includes  a data type called byte in addition in C++ and python
		 boolean = 1 bit, 
		 byte = 2 byte,
		 int = 4 bytes, 
		 short = 4 byte, 
		 long = 8 byte, 
		 double = 8 byte,
		 float = 4 byte, 
		 char = 1 byte,
		 
		 The above eight data types are called primitive or predefined data types.
		 
		   String => is a user defined or reference data type and so that a reference data type
		           begins with capital letter.
		 
		  */
		String Name = "Hailemeskel Getaneh";
		    System.out.println("Hello " + Name);
		int myNumber = 16;
		    System.out.println(myNumber);
		float PI = 3.14f;
		    System.out.println(PI);
		long population = 1232324343L;
		    System.out.println(population);
		double area = 43.434;
		    System.out.println(area);
		char symbol = 'M';
		    System.out.println(symbol);
				
		   /*

3.Static/Class Variable
A static/class variable can be defined using the static keyword.
These variables are declared inside a class but outside a method
and code block.
A class/static variable can be created at the start of the
program and destroyed at the end of the program.
		    */
		    
		  Main x = new Main();
		   x.myNum(343);
	}

}
