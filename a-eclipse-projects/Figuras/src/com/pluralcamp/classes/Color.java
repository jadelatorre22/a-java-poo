package com.pluralcamp.classes;

public class Color {

	//ATRIBUTOS
	private final int red;
	private final int green;
	private final int blue;
	private final BasicColor basicColor;
	
	public final static int MAX = 255; //Se puede poner de las dos maneras
	public static final int MIN = 0;
	
	
	public Color(BasicColor basicColor) {
		this.red = basicColor.red;
		this.green = basicColor.green;
		this.blue = basicColor.blue;
		this.basicColor = basicColor;
	}
	
	//CONSTRUCTORES
	public Color(int red, int green, int blue) {
		//RED
		if (validaColor(red))
			this.red = red;
		else 
			this.red = Color.MAX;
			
		//GREEN
		if (validaColor(green))
			this.green = green;
		else 
			this.green = Color.MAX;
		
		//BLUE
		if (validaColor(blue))
			this.blue = blue;
		else 
			this.blue = Color.MAX;	
			
		basicColor = null;
	
	}

	//Helper method / ayuda auxiliar, NO FORMAN PARTE DEL COMPORTAMIENTO
	private boolean validaColor(int value) {
		if(value < Color.MIN || value > Color.MAX) {
				System.out.printf("Valor %d invalido %n", value);
				return false; //Valor invalido
		}	else {
				return true; //Valor valido
			}
		
	}
	
	//GETTERS
	public int getRed() {
		return red;
	}

	public int getGreen() {
		return green;
	}



	public int getBlue() {
		return blue;
	}


	public String toString() {
		if(this.basicColor == null) { //Color no es un color básico
			return " (From basicColor) " + "COLOR" +
				": RGB(" + this.red + "," + this.green + "," + this.blue + ")";
		}	else //Si es un color básico 
				return (" (From Color) ") + this.basicColor.toString();
				
	}
		
	
	
	//BEHAVIOR
	public enum BasicColor {
		BLACK(Color.MIN,Color.MIN,Color.MIN), 
		WHITE(Color.MAX,Color.MAX,Color.MAX), 
		RED(Color.MAX, Color.MIN, Color.MIN), 
		GREEN(Color.MIN, Color.MAX, Color.MIN), 
		BLUE(Color.MIN, Color.MIN, Color.MAX), 
		CYAN(Color.MIN, Color.MAX, Color.MAX), 
		MAGENTA(Color.MAX, Color.MIN, Color.MAX), 
		YELLOW(Color.MAX, Color.MAX, Color.MIN);
		
		
		private final int red;
		private final int green;
		private final int blue;
		
		
		private BasicColor(int red, int green, int blue) {
			this.red = red;
			this.green = green;
			this.blue = blue;
			
		}


		public int getRed() {
			return red;
		}


		public int getGreen() {
			return green;
		}


		public int getBlue() {
			return blue;
		}
		
		public String toString() {
		 return	" (From basicColor) " + this.name() +
			": RGB(" + this.red + "," + this.green + "," + this.blue + ")";
		}
		
	}
}


