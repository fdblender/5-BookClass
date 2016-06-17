import java.text.NumberFormat;

public class BookFormatter {

	public static String getFormattedPrice(float price) {
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		return currency.format(price);
	}
}
