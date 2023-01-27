package com.pluralcamp.classes;

//public abstract class Shape { ----> Tambien serviria para hacer el override
public class Shape {
	
	private Color backgroundColor;
	private Color color;
	
	
	//setters y getters
	public Color getBackgroundColor() {
		return backgroundColor;
	}

	public void setBackgroundColor(Color backgroundColor) {
		this.backgroundColor = backgroundColor;
	}


	public Color getColor() {
		return color;
	}


	public void setColor(Color color) {
		this.color = color;
	}


	//Behavior ---> comportamiento
	public double getArea() {
		System.out.println("Calculando el area. Espere por favor...");
		//switch
		//square: la implementacion del cuadrado
		return 1.0;
		
		//public abstract double getArea(); ---> esta tambien serviria junto
		//cambiando la clase por: public abstract class Shape {
	}


}
