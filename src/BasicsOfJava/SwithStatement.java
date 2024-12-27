package BasicsOfJava;

public class SwithStatement {

	public static void main(String[] args) {
		// switch statements work like the if statements but..
		
		 String day = "Tuesday";
		  day = day.toLowerCase();
		  
		 switch(day) {
		 case "sunday":
			 System.out.println("today is sunday");
			 break;
		 case "monday":
			 System.out.println("today is monday");
			 break;
		 case "tuesday":
			 System.out.println("today is tuesday");
			 break;
		 case "wednesday":
			 System.out.println("today is wednesday");
			 break;
		 case "thursday":
			 System.out.println("today is thursday");
			 break;
		 case "friday":
			 System.out.println("today is friday");
			 break;
		 case "saturday":
			 System.out.println("today is saturday");
			 break;
		default:
			System.out.println("Invalid input");
		 }

	}

}
