package product;

import java.util.LinkedList;
import java.util.List;

/*
Create an abstract class named Product with methods like getPrice() and getDescription().
Extend the abstract class in classes representing different types of products such as ElectronicsProduct , ClothingProduct , and BookProduct .
Display the details of products and calculate the total price in a shopping cart.
 */
public class ShoppingCart {
	List<Product> cart;
	
	public ShoppingCart() {
		this.cart = new LinkedList<>();
	}
	
	public List<Product> getCart(){
		return cart;
	}
	
	public void addToCart(Product product) {
		cart.add(product);
	}
	
	public void displayCart() {
		int sum = 0;
		System.out.println("Shopping Cart:");
		for(Product product:cart) {
			System.out.println("\n\n"+product.getDescription()+" -- Price:Rs "+product.getPrice());
			sum += product.getPrice();
		}
		System.out.println("\nTotal Price:"+sum);
	}
	
	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		Product headSet = new ElectronicsProduct("speakers", 5000,"JBL","Wireless");
		Product laptop = new ElectronicsProduct("Laptop",20000,"Lenovo","Gaming");
		Product tshirt = new ClothingProduct("Tshirt", 200, 32,"Blue");
		Product book = new BookProduct("Harry Potter", 150,"JK Rowling",460);
		cart.addToCart(book);
		cart.addToCart(laptop);
		cart.addToCart(tshirt);
		cart.addToCart(headSet);
		cart.displayCart();
		
	}
}
