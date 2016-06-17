//import BookClass.*;

public class BookApp {

	public static void main(String[] args) {
		BookClass book = new BookClass("Farenheit 451", "Ray Bradbury", 
				"futuristic novel set in totalitarian society");
		
		System.out.println(book.getDisplayText());

	}

}
