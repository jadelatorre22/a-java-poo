package com.pluralcamp.classes;

public class Persona extends SerVivo {
	
	private String nombre;

	//COnstructor por defecto --> Se puede escribir o no
	public Persona() { 
		//No es obligatorio poner el super(); (solo en algún caso especial)
		super(); //Llama al constructor de SerVivo
		System.out.println("Desde el constructor Persona sin parámetros");
	}
	
 public Persona(String nombre) { 
	 	this(); //Llama al constructor de Persona 
		this.nombre = nombre; //El parámetro del propio constructor
		System.out.println("Desde el constructor Persona con el parámetro nombre");
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

}
