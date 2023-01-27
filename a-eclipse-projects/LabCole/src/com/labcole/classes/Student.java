package com.labcole.classes;

public class Student extends Person {

	private String curso;
	private Subject matricula[];
	
	
	public void seMatricula(Subject subject) {
		System.out.printf("El alumno se matricula de %s %n", subject);
	}
	
	public void estudia(String subject) {
		System.out.printf("El alumno estudia para el examen de programación "
				+ "de %s %n", subject);
	}
	
}
