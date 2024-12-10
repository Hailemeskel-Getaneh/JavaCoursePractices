package BasicsOfJava;
import java.util.Random;

//NB. If there is a package to be imported the name of that package and the class cannot be the same.

public class RandomNumGerator {
    public static void main(String[] args) {
        Random random = new Random();
        int randomInteger = random.nextInt(100); // Generates a random number between 0 and 99
        System.out.println("Random number: " + randomInteger);
        
        double randomDouble = random.nextDouble(1000); 
        // generates a random double between 0 and 1000 excluding 1000.
        
        System.out.println(randomDouble);
        
        boolean boolValue = random.nextBoolean(); // Generates either true or false randomly
        
        System.out.println(boolValue); 
    }
}

