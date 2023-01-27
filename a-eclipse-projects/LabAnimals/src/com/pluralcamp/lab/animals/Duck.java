package com.pluralcamp.lab.animals;

public class Duck extends Animal implements Speakable {

	//ESTADO
	boolean isUgly;
	
	//COMPORTAMIENTO

	public void vuela() {
		System.out.println("El patito esta volando");
		
	}
	
	@Override
	public void makeSound() {
		System.out.println("El patito hace cuack! cuack!");
	}
	
	public void come() {
		System.out.print("Soy un patito:");
		super.come();
	}
}

