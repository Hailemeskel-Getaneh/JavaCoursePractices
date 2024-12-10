import java.util.Scanner;

class Employee{
	public String name, email, city, id, job ;


	public void employInfo(String name, String email, String city, String id, String job){
		
		this.name = name;
		this.email = email;
		this.city = city;
		this.id = id;
		this.job = job;
		
	}
	
	public void display() {
		System.out.println("Here are the "+"Name :" +name + "\n" + 
				"Email: " +email + "\n" + "city: "+ city + "\n" + "Id: " + id + "\n" + "Job: "+job);
	}
	
	
	
}

public class EmployInfo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee E1 = new Employee();
		String name, email, city, id, job ;
		
		Scanner scanner = new Scanner(System.in);
		 System.out.println("Enter Employee's name :");
		 name = scanner.nextLine();
		 
		 System.out.println("Enter Employee's email :");
		 email = scanner.nextLine();
		 
		 System.out.println("Enter Employee's city :");
		 city = scanner.nextLine();
		 
		 System.out.println("Enter Employee's job :");
		 job = scanner.nextLine();
		 
		 System.out.println("Enter Employee's id :");
		 id = scanner.nextLine();
		
		E1.employInfo(name, email, city, id, job);
		E1.display();
		
		scanner.close();

	}

}
