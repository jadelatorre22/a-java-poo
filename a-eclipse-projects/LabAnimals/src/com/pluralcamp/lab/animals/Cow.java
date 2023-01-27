package com.pluralcamp.lab.animals;

public class Cow  extends Animal implements Speakable {

	//ESTADO
	boolean lactant; // si da leche o no 
	
	//COMPORTAMIENTO

	public void teMira() {
		System.out.println("La vaca se te queda mirando fijamente");
	}
	
	public void come() {
		System.out.print("Soy una vaca:");
		super.come();
	}
	
	@Override
	public void makeSound() {
		System.out.println("La vaca hace muuu");
	}
}
