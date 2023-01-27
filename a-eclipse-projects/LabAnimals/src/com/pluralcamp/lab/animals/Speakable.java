package com.pluralcamp.lab.animals;

public interface Speakable {
	
	public void makeSound();
	
	public default void organ() {
		System.out.println("Parlo por la boca");
		origen();
	}

	private void origen() {
		System.out.println("Estoy en la interfície");
	}
	
}
