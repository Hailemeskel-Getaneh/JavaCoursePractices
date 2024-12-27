package classWithMethods;
import java.util.Scanner;

class Book {

	public String title;
	public String author;
	public double price;
	
	Book(String Title, String Author){
		title = Title;
		author = Author;
	}
	
	Book(String Title, String Author, double Price){
		title = Title;
		author = Author;
		price = Price;
	}
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the title of book 1 :");
		 String book1Title = scanner.nextLine();
		 System.out.print("Enter the author of book 1 :");
		 String book1Author = scanner.nextLine();
		 System.out.print("Enter the title of book 2 :");
		 String book2Title = scanner.nextLine();
		 System.out.print("Enter the author of book 2 :");
		 String book2Author = scanner.nextLine();
		 System.out.print("Enter the price of book 2 :");
		 double book2Price = scanner.nextDouble();
		
			System.out.println("\n\n \tBook2\t\t");
		Book book1 = new Book(book1Title, book1Author);
        System.out.println("title : " + book1.title + "   "+ "author : " + book1.author);
    	Book book2 = new Book( book2Title, book2Author, book2Price);
    	System.out.println("\n\n \tBook1\t\t");
        System.out.println("title: " + book2.title + "   "+ "author : " + book2.author + "   " + "price : " + book2.price);

	}

}
