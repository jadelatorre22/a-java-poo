package com.labcole.classes;

public class App {

	public static void main (String [] args) {
		
		Student alumno = new Student();
		
		Teacher profesor = new Teacher();
		
		Manager mang = new Manager();
		
		Administrator secretaria = new Administrator();
		
		Person personas[] = new Person[] {alumno,profesor,mang,secretaria};
		for(Person persona: personas) {
		persona.asiste();
		System.out.println(persona.getClass().getSimpleName());
		
		}
		
		Worker trabajadores[] = new Worker[] {profesor,mang,secretaria};
		for(Worker trabajador: trabajadores) {
			System.out.println(trabajador.getClass().getSimpleName());
			trabajador.clockIn();
			trabajador.getPayment();
		}
	}
}
