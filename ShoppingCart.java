package hackproject;

import java.util.ArrayList;

public class ShoppingCart {
	private ArrayList<Item> cart;
	//Add things to your cart by pushing your groceries into this shopping
	//cart ArrayList
	
	public ShoppingCart() {
		
	}
	
	public void addToShoppingCart(Item i) {
		cart.add(i);
	}
	
	public void removeFromShoppingCart(Item i) {
		cart.remove(i);
	}
	
	public void emptyCart() {
		cart.clear();
	}
	
	public int calculateCost(ArrayList<Item> shoppingCart, double tax) {
		int total = 0;
		for(Item i : shoppingCart) {
			double afterTax = i.getPrice() * (1 + tax);
			total += afterTax;
		}
		
		return total;
	}
}
