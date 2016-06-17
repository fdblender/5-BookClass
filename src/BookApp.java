//import BookClass.*;

public class BookApp {

	public static void testBookClass() {
		// test overloaded constructor
		BookClass book2 = new BookClass();
		book2.setTitle("Persuasion");
		book2.setAuthor("Jane Austen");
		book2.setDescription("Victorian novel");

		System.out.println(book2.getDisplayText() + "\n");

		// create new book to test overloaded constructor
		BookClass book = new BookClass("SKU001", "Farenheit 451", "Ray Bradbury",
				"futuristic novel set in totalitarian society");

		book.setInStock(true);

		System.out.println(book.getDisplayText() + "\n");

		book.setPrice(25f);

		System.out.println("Price for 1 book: " + BookFormatter.getFormattedPrice(book.getPrice(1)));

		System.out.println("Price for 4 books: " + BookFormatter.getFormattedPrice(book.getPrice(4)));

		System.out.println("Price for 5 books: " + BookFormatter.getFormattedPrice(book.getPrice(5)));

		System.out.println("Price for 10 books: " + BookFormatter.getFormattedPrice(book.getPrice(10)));

		System.out.println("Price for 14 books: " + BookFormatter.getFormattedPrice(book.getPrice(15)));

		System.out.println("Price for 15 books: " + BookFormatter.getFormattedPrice(book.getPrice(15)));
	}

	public static void main(String[] args) {

		String books[][] = {
				{ "Java1001", "Head First Java", "Kathy Sierra and Bert Bates", 
					"Easy to read Java workbook", "47.50" },
				{ "Java1002", "Thinking in Java", "Bruce Eckel", 
						"Details about Java under the hood", "20.00" },
				{ "Orcl1003", "OCP: Oracle Certified Professional Java SE", "Jeanne Boyarsky",
						"Everything you need to know in one place", "45.00" },
				{ "Python1004", "Automate the Boring Stuff with Python", "Al Sweigart", 
						"Fun with Python", "10.50" },
				{"Zombie1005","The Maker's Guide to the Zombie Apocalypse","Simon Monk",
						"Zombie book", "10.00"},
				{"Rasp1006", "Raspberry Pi Projects for the Evil Genius", "Donal Norris", 
						"A dozen fiendishly fun projects for the Raspberry Pi!", "10.00"},
				
		};

	
		BookDatabase bookDB = new BookDatabase(10);
		BookClass retrievedBook;

		for (int i = 0; i < 6; i++) {
			bookDB.addBook(books[i][0], books[i][1], books[i][2], books[i][3]);
		}

		retrievedBook = bookDB.getBook("Java1001");
		System.out.println("\nFound book: ");
		System.out.println(retrievedBook.getDisplayText());

		retrievedBook = bookDB.getBook("Java1002");
		System.out.println("\nFound book: ");
		System.out.println(retrievedBook.getDisplayText());

		retrievedBook = bookDB.getBook("Orcl1003");
		System.out.println("\nFound book: ");
		System.out.println(retrievedBook.getDisplayText());

		
		retrievedBook = bookDB.getBook("Rasp1006");
		System.out.println("\nFound book: ");
		System.out.println(retrievedBook.getDisplayText());
		
		testBookClass();

	}

}
