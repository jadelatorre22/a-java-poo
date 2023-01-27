package com.pluralcamp.classes;

public class App {
	
	public static void main(String[] args) {
	//escribir main, pulsar ctrl + espacio y seleccionar method	
		
		System.out.println("--- Objeto de JugadorBasket: ---");
		JugadorBasket player = new JugadorBasket();
		System.out.println("--- Objeto de Deportista: ---");
		Deportista deportista = new Deportista();
		System.out.println("--- Objeto de Persona: ---");
		Persona persona = new Persona();
		System.out.println("--- Objeto de Persona2: ---");
		Persona persona2 = new Persona("Laura");
		System.out.println("--- Objeto de SerVivo: ---");
		SerVivo serVivo = new SerVivo();
		System.out.println("--- Objeto de Object: ---");
		Object object = new Object();
		
		
		System.out.printf("%n --- Casting con polimorfismo: --- ");
		Persona person = new Deportista(); //Objeto Deportista
		Deportista sportsMan = (Deportista)person; //Casting
		sportsMan.setDeporte("Basket"); //Casting
		person.setNombre("Michael Jordan");
		System.out.println(sportsMan.getDeporte());
		System.out.println(person.getNombre());
		
		
	}

}
