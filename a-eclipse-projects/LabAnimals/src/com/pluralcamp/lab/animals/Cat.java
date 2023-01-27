package com.pluralcamp.lab.animals;

public class Cat extends Animal implements Speakable{
     
	//ESTADO 
	int edad; 
	
	//COMPORTAMIENTO (BEHAVIOR)
		
	public void salta() {
		System.out.println("El gato esta saltando");
		//escribir sysout, ctrl + espacio para que salga auto
	}

	public void lick() {
		System.out.println("El gato se esta lamiendo");
	}
	
	@Override
	public void makeSound() {
		System.out.println("El gato hace miauuu");
	}
	
	public void come() {
		System.out.print("Soy un gato:");
		super.come();
	}

}
