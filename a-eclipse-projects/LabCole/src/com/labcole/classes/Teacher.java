package com.labcole.classes;

public class Teacher extends Person implements Worker {

	private String asignatura;
	private Subject corrigeExamen[];
	

	
	public void corrigeExamen(Subject subject) {
		System.out.printf("El profesor corrige los examenes de %s %n", subject);
	}
	
	public void castiga() {
		System.out.println("Castiga a los alumnos");
	}

	@Override
	public void getPayment() {
		System.out.println("Cobra 1200€ al mes ");
	}
}
