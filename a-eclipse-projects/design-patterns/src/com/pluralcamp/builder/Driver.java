package com.pluralcamp.builder;

public class Driver {

	public static void main(String[] args) {
		
		LunchOrderBean order = new LunchOrderBean();
		
		order.setBread("Pan de pita");
		order.setCondiments("Olivas");
		order.setDressing("Salsa de Kebab");
		order.setMeat("Kebab");
		
		System.out.println(order.toString());
		
		System.out.println("------------------------------");
		
		LunchOrderTele ordert = new LunchOrderTele("Pan de espelta", "Monster", 
				"Vinagre", "Bistec");
		
		System.out.println(ordert.toString());
		

		System.out.println("------------------------------");
		
		
		LunchOrderTele ordert2 = new LunchOrderTele("Pan de espelta", "Monster", 
				"Vinagre");
		
		System.out.println(ordert2.toString());
		
	
		System.out.println("------------------------------");
		
		
		LunchOrder.Builder builder = new LunchOrder.Builder();
		builder.bread("Pan de Pita");
		builder.condiments("Patatas fritas");
		builder.dressing("Salsa de kebab");
		builder.meat("Kebab");
		
		LunchOrder orderb = builder.build();
		System.out.println(orderb.toString());
		
	}
}
