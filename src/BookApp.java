//import BookClass.*;

public class BookApp {

	public static void main(String[] args) {
		BookClass book = new BookClass("Farenheit 451", "Ray Bradbury", 
				"futuristic novel set in totalitarian society");
		
		book.setInStock(true);
		
		System.out.println(book.getDisplayText());
		
		book.setPrice(25f);
		
		System.out.println("Price for 1 books: "
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
