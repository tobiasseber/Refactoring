public class Movie {
	public static final int CHILDRENS = 2;
	public static final int REGULAR = 0;
	public static final int NEW_RELEASE = 1;
	private String title;
	private Price price;

	public Movie(String newtitle, int newpriceCode) {
		title = newtitle;
		setPriceCode(newpriceCode);
	}

	public int getPriceCode() {
		return this.price.getPriceCode();
	}

	public void setPriceCode(int arg) {
		switch (arg) {
		case Movie.REGULAR:
			this.price = new RegularPrice();
			break;
		case Movie.CHILDRENS:
			this.price = new ChildrensPrice();
			break;
		case Movie.NEW_RELEASE:
			this.price = new NewReleasePrice();
			break;
		default:
			throw new IllegalArgumentException("Incorrect Price Code");
		}
	}

	public String getTitle() {
		return title;
	}

	double getCharge(int daysRented) {
		return this.price.getCharge(daysRented);
	}

	int getFrequentRenterPoints(int daysRented) {
		return this.price.getFrequentRenterPoints(daysRented);
	}
}