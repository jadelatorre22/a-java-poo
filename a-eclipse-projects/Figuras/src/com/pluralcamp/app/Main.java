package com.pluralcamp.app;

import com.pluralcamp.classes.Rectangle;
import com.pluralcamp.classes.Square;
import com.pluralcamp.classes.Circle;
import com.pluralcamp.classes.Color;
import com.pluralcamp.classes.Sphere;

//java.lang

public class Main {

	public static void main(String[] args) {
		
		System.out.printf("%n----- COLORES BÁSICOS -----%n");
		
		System.out.println(Color.BasicColor.BLUE.toString());
		System.out.println(Color.BasicColor.YELLOW);
		
		
		//COLORES BÁSICOS
		Color white = new Color(Color.BasicColor.WHITE);
		System.out.println(Color.BasicColor.WHITE);
		System.out.println(white);
		
		Color black = new Color(Color.BasicColor.BLACK);
		System.out.println(black);
		
		Color red = new Color(Color.BasicColor.RED);
		System.out.println(red);
		
		Color green = new Color(Color.BasicColor.GREEN);
		System.out.println(green);
		
		Color blue = new Color(Color.BasicColor.BLUE);
		System.out.println(blue);
		
		Color yellow = new Color(Color.BasicColor.YELLOW);
		System.out.println(yellow);
		
		System.out.printf("%n----- COLORES -----%n");
		
		//OTROS COLORES
		Color color1 = new Color(200,160,160);
		System.out.println(color1);
		//color1.setRed(100); //---> TE MODIFICA EL COLOR1
		//color1.setColor(100,170,80);
		Color color2 = new Color(-12,14,230);
		System.out.println(color2);
		
		
		System.out.printf("%n----- FIGURAS -----%n");
		
		//CUADRADO 
		Square square = new Square(5.0, color1, color2); //side vale side
		double areaCuadrado = square.getArea();
		System.out.printf(
		"Cuadrado de color %s y de lado %.2f tiene un area de %.2f %n ",
		square.getBackgroundColor().toString(), 
		square.getSide(),
		areaCuadrado);
	
		
		Square square2 = new Square(9.0);
		System.out.printf(
		"Cuadrado 2 de color %s y de lado %.2f tiene un area de %.2f %n ",
		square2.getBackgroundColor().toString(), 
		square2.getSide(),
		square2.getArea());
	
		
		//RECTANGULO
		Rectangle rectangle = new Rectangle(4.0, 3.0);
		rectangle.setBackgroundColor(green);
		rectangle.setColor(white);
		//rectangle.base = -4.0; //VALOR INVALIDO
		//rectangle.setBase(4.0);
		//rectangle.height = 3.0;
		rectangle.setHeight(3.0);
		double areaRectangulo = rectangle.getArea();
		System.out.printf(
		"(Rectangulo de color %s , de base %.2f y de altura %.2f "
		+ " tiene un area de %.2f %n ", 
		rectangle.getBackgroundColor().toString(), 
		rectangle.getBase(), 
		rectangle.getHeight(),
		areaRectangulo);
		
		
		//CIRCULO
		Circle circle = new Circle(6.5);
		circle.setBackgroundColor(blue);
		circle.setColor(yellow);
		//circle.radius = 6.5;
		//circle.setRadius(6.5);
		double radioCirculo = circle.getArea();
		System.out.printf(
		"(Circulo de color %s y de radio %.2f tiene un area de %.2f %n ", 
		circle.getBackgroundColor().toString(),
		circle.getRadius(),
		radioCirculo);

		
		//ESFERA
		Sphere sphere = new Sphere(7.8);
		sphere.setColor(red);
		//sphere.radius = 9.0;
		//sphere.setRadius(9.0);
		System.out.printf(
		"(Esfera de color %s y de radio %.2f tiene un area de %.2f %n y un"
		+ " volumen de %.2f %n ",
		sphere.getColor(),
		sphere.getRadius(),
		sphere.getArea(),
		sphere.getVolume());
		
		
		
		
		
	}
}
