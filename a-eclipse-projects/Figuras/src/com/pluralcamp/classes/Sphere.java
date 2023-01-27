package com.pluralcamp.classes;

public class Sphere extends Shape {

	private double radius;
	//private Color backgroundColor;
	//private Color color;
	public Sphere() {}
	
	public Sphere(double radius) {
		this.setRadius(radius);
		System.out.printf("Esfera construida con radio de " + 
		"%f %n", this.radius);
		
	}
	
	
	public double getRadius() {
		return radius;
	}


	public void setRadius(double radius) {
		if(radius < 0) {
			System.out.println("Valor invalido");
		}else {
			this.radius = radius;
		}
	}
	
	

	public double getVolume() {
		return (4.0/3.0) * Math.PI * radius * radius * radius;
	}
	
	@Override
	public double getArea() {
		super.getArea();
		return 4 * Math.PI * Math.pow(this.radius,2);
	}


}
