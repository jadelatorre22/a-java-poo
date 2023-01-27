package com.pluralcamp.classes;

public class Rectangle extends Shape {

	private double base;
	private double height; //setHeight
	//private Color backgroundColor;
	//private Color color;
	
	public Rectangle() {}
	
	public Rectangle(double base) {
		this.setBase(base);
	}
	
	public Rectangle(double base, double height) {
		this.setBase(base);
		this.setHeight(height);
		System.out.printf("Rectangulo construido con base de " +  
		"%f " + "y altura de " +  "%f %n", this.base, 
		this.height);
	}
	
	//setter ---> set seguido del nombre del atributo 
	// primera letra en mayúscula
	public void setBase(double value) {
		if (value < 0) {
			System.out.println("Valor invalido");
		}else {
			base = value;
		}
	}
	
	public double getBase() {
		return this.base;
	}
	
	public void setHeight(double height) {
		if (height < 0) {
			System.out.println("Valor invalido");
		} else {
			this.height = height;
		}
	}
	

	public double getHeight() {
		return this.height;
	}
	
	@Override
	public double getArea() {
		super.getArea();
		return base * height;
	}
	
	
	public double getPerimeter() {
		return (this.base * 2) + (this.height * 2);
		
	}

	
}
