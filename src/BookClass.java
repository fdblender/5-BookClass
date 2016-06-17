import java.text.NumberFormat;

public class BookClass {
	private String title;
	private String author;
	private String desc;
	private float price;
	private boolean isInStock;	
	
	public BookClass() {
		title = "";
		author = "";
		desc = "";
		price = 0f;
		isInStock = false;
	}
	public BookClass(String title, String author, String desc) {
		this.title = title;
		this.author = author;
		this.desc = desc;		
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle() {
		return this.title;
	}
	public void setAuthor(String title) {
		this.author = author;
	}
	public String getAuthor() {
		return this.author;
	}
	public void setDescription(String title) {
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
	public String getFormattedPrice() {
		NumberFormat currency = 
				NumberFormat.getCurrencyInstance();
		return currency.format(price);		
	}
	public void setInStock(boolean isInStock) {
		this.isInStock = isInStock;
	}
	public boolean isInStock() {
		return this.isInStock;
	}	
	public String getDisplayText() {
		return (title+" | "+author+" | "+desc);
	}	

}
