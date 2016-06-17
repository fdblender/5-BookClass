//import BookClass.*;

public class BookApp {

	public static void main(String[] args) {
		
		// test overloaded constructor
		BookClass book2 = new BookClass();
		book2.setTitle("Persuasion");
		book2.setAuthor("Jane Austen");
		book2.setDescription("Victorian novel");
		
		System.out.println(book2.getDisplayText()+"\n");
		
		
		// create new book to test overloaded constructor
		BookClass book = new BookClass("Farenheit 451", "Ray Bradbury", 
				"futuristic novel set in totalitarian society");	
		
		book.setInStock(true);	
		
		System.out.println(book.getDisplayText()+"\n");
		
		book.setPrice(25f);
		
		System.out.println("Price for 1 book: "
				+BookFormatter.getFormattedPrice(book.getPrice(1)));
		
		System.out.println("Price for 4 books: "
				+BookFormatter.getFormattedPrice(book.getPrice(4)));

		System.out.println("Price for 5 books: "
				+BookFormatter.getFormattedPrice(book.getPrice(5)));
		
		System.out.println("Price for 10 books: "
				+BookFormatter.getFormattedPrice(book.getPrice(10)));
		
		System.out.println("Price for 14 books: "
				+BookFormatter.getFormattedPrice(book.getPrice(15)));

		System.out.println("Price for 15 books: "
				+BookFormatter.getFormattedPrice(book.getPrice(15)));



	}

}
