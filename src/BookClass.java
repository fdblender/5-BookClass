import java.text.NumberFormat;

public class BookClass {
	private String sku;
	private String title;
	private String author;
	private String desc;
	private float price;
	private boolean isInStock;
	private static float GROUP_PRICE = 100.00f;

	public BookClass() {
		title = "";
		author = "";
		desc = "";
		price = 0f;
		isInStock = false;
	}

	public BookClass(String sku, String title, String author, String desc) {
		this.sku = sku;
		this.title = title;
		this.author = author;
		this.desc = desc;
	}
	public void setSku(String sku) {
		this.sku = sku;		
	}
	public String getSku() {
		return this.sku;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return this.title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getAuthor() {
		return this.author;
	}

	public void setDescription(String desc) {
		this.desc = desc;
	}

	public String getDescription() {
		return this.desc;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public float getPrice() {
		return this.price;
	}

	// This method returns the price of the requested number of books
	// if not in stock, it returns 0
	public float getPrice(int noRequested) {
		float total = 0f;
		int group = 0;
		int individualBooks = 0;
		
		if (this.isInStock) {
			// determine how many groups of 5 books there are
			group = noRequested / 5;
			individualBooks = noRequested - (group*5);
			
			// total is number of groups * 5 plus the no of individual books * book price
			total = (group * GROUP_PRICE) + (individualBooks*this.price);
		}		
		return total;
	}

	public String getFormattedPrice() {
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		return currency.format(this.price);
	}

	public void setInStock(boolean isInStock) {
		this.isInStock = isInStock;
	}

	public boolean isInStock() {
		return this.isInStock;
	}

	public String getDisplayText() {
		return (this.sku + " | "+this.title + " | " + this.author + " | " + this.desc);
	}

}
