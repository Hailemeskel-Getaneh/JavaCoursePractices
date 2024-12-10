package Array;

public class Two_Dimessional_array {

	public static void main(String[] args) {
		// this is a two dimensional array in java
		
		// String students = new String[3][3];  // this is the way of declaring 2D array with size
		
		String [][] students = {
				{"Hailemeskel", "Martemuz", "Elias"},
				{"Belay", "Ermias", "belachew"},
				{"Demissew", "Selamawit", "Belege"}
		};
		
		String student1 = students[1][1];
		System.out.println(student1);
		
		// let us print the array using a for loop
		
		for (int i = 0; i < students.length; i++) {
			
			System.out.println();
			for(int j = 0; j < students.length; j++) {
				System.out.println(students[i][j] + " ");
			}
		}

	}

}
