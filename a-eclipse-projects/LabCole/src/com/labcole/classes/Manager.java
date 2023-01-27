package com.labcole.classes;

public class Manager extends Person implements Worker {

	private String equipo;

	

	
	public void acompaña() {
		System.out.println("Acompaña al equipo directivo");
	}
	
	public void reune(String subject) {
		System.out.printf("El Manager se reune %s %n", subject);
	}

	@Override
	public void getPayment() {
		System.out.println("Cobra 1000€ al mes ");
		
	}
}
