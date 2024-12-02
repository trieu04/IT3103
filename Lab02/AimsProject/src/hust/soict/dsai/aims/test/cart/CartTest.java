package hust.soict.dsai.aims.test.cart;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.DigitalVideoDisc;

public class CartTest {
	public static void main(String[] args) {
		// Create a new cart
		Cart cart = new Cart();

		// Create new dvd objects and add them to the cart
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		cart.addMedia(dvd1);

		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
		cart.addMedia(dvd2);

		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
		cart.addMedia(dvd3);

		// Test the print method
		cart.print();

		// Test search
		cart.searchByID(1);
		System.out.println();
		cart.searchByID(4);
		System.out.println();
		cart.searchByTitle("lion");
		System.out.println();
		cart.searchByTitle("alan");
		System.out.println();
	}
}
