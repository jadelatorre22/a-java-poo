package com.pluralcamp.lab.animals;

public class Android implements Speakable {

	@Override
	public void makeSound() {
		System.out.println("Beep! Beep! Beep!");
	}
	
	@Override
	public void organ() {
		System.out.println("Parlo per l'altaveu");
	}
}
