package com.pluralcamp.classes;

public class Circle extends Shape {

	private double radius;
	//private Color backgroundColor;
	//private Color color;
	
	public Circle() {}
	
	public Circle(double radius) {
		this.setRadius(radius);
		System.out.printf("Circulo construido con radio de " 
		+ "%f %n ", this.radius);
	}

	public void setRadius(double radius) {
		//Control de validez
		if(radius < 0) {
			System.out.println("Valor invalido");
		}else {
			this.radius = radius;
		}
	}
	
	
	public double getRadius() {
		return this.radius;
	}
	
	@Override
	public double getArea() {
		super.getArea();
		return Math.PI * radius * radius;
	}		//no hace falta poner el import java.lang.math 
			//porque se importa automaticamente por defecto
	
	public double getPerimeter() {
		return 2* Math.PI * this.radius;
	}
	
	
}
