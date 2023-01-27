package com.pluralcamp.classes;

/*
 * Clase principal:
 * CONTIENE EL PUNTO DE ENTRADA A LA APLICACIÓN.
 * Puede llamarse como se quiera.
 * Aunque por convenio suele llamarse:
 * - Main
 * - App
 * - Aplication
 * - Driver
*/
public class Main {
	/*
	 * Este metodo es el metodo principal
	 * que toda aplicación Java DEBE tener.
	 * Es un metodo OBLIGATORIO.
	 * DEBE SER:
	 * - publico
	 * - estatico
	 * - void
	 * - parametro DEBE ser un array de String
	 * - Su nombre DEBE ser main
	 * Si se cumple TODO esto, VA A SER (SIEMPRE)
	 * NUESTRO PUNTO DE ENTRADA A LA APLICACIÓN 
	 * (La aplicación empieza a ejecutarse aqui)
	 * Este metodo main (metodo principal) o
	 * punto de entrada de mi aplicación
	 * ES LLAMADO AUTOMATICAMENTE POR LA JVM
	 */
	public static void main(String[] args) {
		//System.out.println("Hola Java");
		
		double[] notas1 = {7.6, 5.5, 9.7, 4.1, 6.6, 5.1, 3.8, 8.6, 9.9, 5.0}; 

		double[] notas2 = {5.0, 4.5, 6.2, 4.9, 7.2, 8.4, 6.5, 3.8, 9.1, 5.7};

		double[] notas3 = {4.5, 6.8, 6.3, 7.9, 7.1, 3.7, 6.0, 9.0, 8.9, 7.3};
		
		Notas.printMaxMin(notas1, 1);
		Notas.printMaxMin(notas2, 2);
		Notas.printMaxMin(notas3, 3);
		//Al llamar a un metodo static 
		//el IDE te lo pone en cursiva
		
		
		//------------------------------
		
		//Este tipo de dato lo hemos creado nosotros 
		//(class Student.java)
		//Variable de tipo Student
		Student estudiante1 = new Student();
		estudiante1.nombre = "Laura";
		estudiante1.edad = 30;
		estudiante1.dni = "12345678L";
		//Al no usar static no hay que poner el nombre de la class
		
		estudiante1.matricula();
		estudiante1.asisteAClase();
		estudiante1.preguntaDudas();
		
		Student estudiante2 = new Student();
		estudiante2.nombre = "Alex";
		estudiante2.edad = 26;
		estudiante2.dni = "87654321A";
	
		estudiante2.matricula();
		estudiante2.asisteAClase();
		estudiante2.preguntaDudas();
		
		//----------------------------
		
		System.out.println("");
		
		Teacher profesor = new Teacher();
		profesor.nombre = "Francesc";
		profesor.edad = 48;
		
		profesor.PasaLista();
		profesor.PoneDeberes();
		
	}
	
}
