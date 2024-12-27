package BasicsOfJava;

public class mShapePattern {

	public static void main(String[] args) {
		// L
	
		int height = 6; // Height of the letter M

        for (int row = 0; row < height; row++) {
            for (int column = 0; column < height; column++) {
            	
                // Print 'M' for edges and the diagonals of the M
                if (    column == 0 || column == height - 1 || 
                		(row == column && column <= height / 2) ||
                		(row + column == height - 1 && column >= height / 2)) {
                	
                  System.out.print("M ") ;                  
                    
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println(); // Move to the next row
        }

	}

}



/* i = 1, j + 1 j = 0 , j= j+2
 * 6 -i  6 - j
 *12345M123456M
 *1234M1M1234M1M
 *123M123M12M123M
  12M12345M12345M
  1M1234567891234M
 * 
 */
