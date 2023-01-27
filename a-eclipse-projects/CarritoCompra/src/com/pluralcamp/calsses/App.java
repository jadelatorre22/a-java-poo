package com.pluralcamp.calsses;

public class App {

	public static void main (String[] args) {
		Product libroJava = new Product(Category.BOOKS, "890K");
		libroJava.setName("Java para todos");
		libroJava.setPrice(4.5f);
		
		Product Portatil = new Product(Category.COMPUTERS,"123");
		Portatil.setName("Vant agile 15");
		Portatil.setPrice(1235.0f);
		
		Product Monster = new Product(Category.FOOD, "MEU");
		Monster.setName("Monster Blanco");
		Monster.setPrice(1.58f);
		
		Cart miCarrito = new Cart();
		
		miCarrito.addProduct(libroJava,8);
		miCarrito.addProduct(Portatil);
		miCarrito.addProduct(Monster,20);
		
		miCarrito.printCart();
		
	}
}
