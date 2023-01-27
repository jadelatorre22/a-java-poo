package com.pluralcamp.lab.animals;

public class Bactery  extends Animal {

	String tipoDeBacteria;
	String forma;
	
	public void infecta() {
		System.out.println("La bacteria infecata");
	}
	
	public void come() {
		System.out.print("Soy una bacteria:");
		super.come();
	}
}
