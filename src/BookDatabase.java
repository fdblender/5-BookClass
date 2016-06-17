
public class BookDatabase {
	
	private BookClass[] bookDatabase;
	private int noBooks;
		
	public BookDatabase (int noBooks) {
		this.bookDatabase = new BookClass[noBooks];		
		noBooks = 0;
	}

	public void addBook(String sku, String title, String author, String desc) {
		BookClass book = new BookClass(sku, title, author, desc);	
		bookDatabase[noBooks] = book;
		this.noBooks++;
	}	
	
	// search for a book by SKU and returns it. 
	// returns null if not found
	public BookClass getBook(String sku) {
			
		for (int i=0;i<this.noBooks;i++) {
			if (this.bookDatabase[i].getSku().equals(sku)) {				
				return this.bookDatabase[i];
			}
		}		
		return null;		
		
	}
}
