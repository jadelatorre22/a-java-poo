package com.labcole.classes;

public class Administrator extends Person implements Worker {

	private String horario;

	

	
	public void ayuda(String subject) {
		System.out.printf("La secretaria ayuda al alumnado %s %n", subject);
	}
	
	public void sentada() {
		System.out.println("Está sentada");
	}

	@Override
	public void getPayment() {
		System.out.println("Cobra 1100€ al mes ");
		
	}
}
