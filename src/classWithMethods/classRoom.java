package classWithMethods;
import java.util.*;

public class classRoom {

	public String className;
	ArrayList<String> students;
	
	classRoom(String ClassName, ArrayList<String> Students){
		className = ClassName;
		students = Students;
	}
	
	public void print() {
		
		System.out.println("\n\nClass Name :" + className );
	
		System.out.println("Students: ");
		
		for (int i = 1; i <= students.size(); i++) {
			
			System.out.println("     " + i + "." + students.get(i - 1));
			
		}
	}
	
	
	public static void main(String[] args) {
		
		ArrayList<String> students = new ArrayList<String>();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number of students to be inseted:");
		
		int n = scanner.nextInt();
		scanner.nextLine();		
		for(int i = 1; i <= n; i++) {
			System.out.print("Enter the name of student " + i + " :");
			String stud = scanner.nextLine();
			
			students.add(stud);
		}

		
		classRoom classOne = new classRoom("Software engineers A", students);
		classOne.print();

	}

}
