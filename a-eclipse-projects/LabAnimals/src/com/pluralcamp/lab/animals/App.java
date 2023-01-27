package com.pluralcamp.lab.animals;

public class App {

	public static void main(String[] args) {
	//escribir main, pulsar ctrl + espacio y seleccionar method

	
		System.out.println("-------- GATO ------");
		Cat gato = new Cat();
//		cat.camina();
//		cat.salta();
//		cat.duerme();
//		cat.lick();
//		cat.meow();
		
		System.out.println("");
		System.out.println("-------- BACTERIA ------");
		Bactery bacteria = new Bactery();
//		bactery.come();
//		bactery.seReproduce();
//		bactery.infecta();
		
		System.out.println("");
		System.out.println("-------- VACA ------");
		Cow vaca = new Cow();
//		cow.camina();
//		cow.come();
//		cow.duerme();
//		cow.teMira();
		
		System.out.println("");
		System.out.println("-------- PATO ------");
		Duck pato = new Duck();
//		duck.camina();
//		duck.vuela();
//		duck.duerme();
//		duck.Cuack();
		
		System.out.println("");
		System.out.println("-------- POLIMORFISMO DE CLASES DE HERENCIA ------");
		
		//POLIMORFISMO
		Animal animals[] = new Animal[] {gato, bacteria, vaca, pato};
		//foreach ---> para cada animal
		for (Animal animal: animals) { //Para recorrer el array
			animal.come();
			System.out.println(animal.getClass());
		}
		
		System.out.println("");
		System.out.println("-------- POLIMORFISMO DE CLASES DE INTERFACES ------");
		
		Android data = new Android();
		
		Speakable[] parlantes = new Speakable[] {gato, vaca, pato, data};
		for(Speakable parlante: parlantes) {
			parlante.makeSound();
			parlante.organ();
			
		}
		
	}
	
}

