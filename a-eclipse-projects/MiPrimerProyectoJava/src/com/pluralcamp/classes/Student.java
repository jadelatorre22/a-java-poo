package com.pluralcamp.classes;
//Plantilla general que represente a un estudiante

//Nombre cualificado de la clase Student:
//com.pluralcamp.classes.Student

public class Student {

	//ATRIBUTOS (VARIABLES):
	String nombre; //Template (plantilla)
	int edad;
	String dni;
	double[] notas;
	
	//METODOS (FUNCIONES)
	void matricula() {
		System.out.println("El estudiante " + nombre + " se matricula");
	}
	
	void asisteAClase() {
		System.out.println("El estudiante " + nombre + " asiste a clase");
	}
	
	void preguntaDudas() {
		System.out.println("El estudiante " + nombre + " pregunta dudas");
	}
}
