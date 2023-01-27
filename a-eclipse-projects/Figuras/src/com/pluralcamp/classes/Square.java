package com.pluralcamp.classes;

public class Square extends Shape {

	private double side; //side vale 0.0
	//private final Color backgroundColor; //Color del fondo
	//private final Color color; //Color de las lineas o foreground color 
	 
	
	//TODAS LAS CLASES TIENEN UN CONSTRUCTOR POR DEFECTO 
	//Y QUE NO ES NECESARIO ESCRIBIR, SOLO SI EL PROGRAMADOR/A
	//NO HA DEFNIDO SU PROPIO CONSTRUCTOR
	
	//Nuevo constructor
	public Square(double side) { 
		if(side < 0) {
		System.out.println("Valor inválido");
		this.side = 1.0;
		} else {
			this.side = side;
		}
		
		this.setBackgroundColor(new Color(Color.BasicColor.WHITE));
		this.setColor(new Color(Color.BasicColor.WHITE));
		
		System.out.printf(
		"Cuadrado construido con lado %f %n ", this.getSide());
	}
	
	public Square() {
		this.side = 1.0;

	}
	
	public Square (double side,Color backgroundColor,Color color) {
		
		if(side < 0) {
			System.out.println("Valor inválido");
			this.side = 1.0;
		} else {
				this.side = side;
			}
				this.setBackgroundColor(backgroundColor);
				this.setColor(color);
	}
	
	

	//BEHAVIOR
	public double getSide() {
		return this.side;
	}
	@Override
	public double getArea() {
		super.getArea();
		return side * side;
	}
	
	public double getPerimeter() {
		return this.side * 4;
	}
	
	
}
