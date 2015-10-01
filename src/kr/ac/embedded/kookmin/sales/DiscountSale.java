package kr.ac.embedded.kookmin.sales;

/**
 * Class for a sale of one item with discount expressed as a percent of the
 * price, but no other adjustments. Class invariant: The price is always
 * nonnegative; the name is a nonempty string; the discount is always
 * nonnegative.
 */

public class DiscountSale extends Sale {
	private double discount; // A percent of the price. Cannot be negative.

	public DiscountSale() {
		/** ���� �Ͻÿ� **/
		name = "No name yet";
		price = 0;
		discount = 0;
	}

	/**
	 * Precondition: theName is a nonempty string; thePrice is nonnegative;
	 * theDiscount is expressed as a percent of the price and is nonnegative.
	 */
	public DiscountSale(String theName, double thePrice, double theDiscount) {
		/** ���� �Ͻÿ� **/
		if (theName == null) {
			System.out.print("Name is empty.");
			System.exit(0);
		} else if (thePrice < 0) {
			System.out.print("Price is negative.");
			System.exit(0);
		} else if (theDiscount < 0) {
			System.out.print("Discount is negative.");
			System.exit(0);
		} else {
			name = theName;
			price = thePrice;
			discount = theDiscount;
		}

	}

	public DiscountSale(DiscountSale originalObject) {
		/** ���� �Ͻÿ� **/
		if (originalObject == null) {
			System.out.println("Error: null originalObject.");
			System.exit(0);
		}

	}

	public static void announcement() {
		System.out.println("This is the DiscountSale class.");
	}

	public double bill() {
		/** ���� �Ͻÿ� **/
		return (getPrice() - getPrice() * discount / 100);
	}

	public double getDiscount() {
		/** ���� �Ͻÿ� **/
		return discount;
	}

	/**
	 * Precondition: Discount is nonnegative.
	 */
	public void setDiscount(double newDiscount) {
		/** ���� �Ͻÿ� **/
		if (newDiscount < 0) {
			System.out.print("Price is negative.");
			System.exit(0);
		} else {
			discount = newDiscount;
		}

	}

	public String toString() {
		return (getName() + " Price = $" + getPrice() + " Discount = " + discount + "%\n" + "   Total cost = $"
				+ bill());
	}

	public boolean equals(Object otherObject) {
		/** ���� �Ͻÿ� **/
		if (otherObject == null)
			return false;
		else if (getClass() != otherObject.getClass())
			return false;
		else {
			Sale otherSale = (Sale) otherObject;
			return (name.equals(otherSale.name) && (price == otherSale.price));
		}
	}

	public DiscountSale clone() {
		/** ���� �Ͻÿ�.... �ӽû����� ��� **/
		return new DiscountSale(this);
	}
}