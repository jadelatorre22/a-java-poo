package com.pluralcamp.lab.vehicles;

public class Vehicle {

	private String color;
	private Gas gas;
	int numberOfWheels;
	
	//getters & setters 
	
	
	public String getColor() {
		return color;
	}

	
	public void setColor(String color) {
		this.color = color;
	}

	
	public Gas getGas() {
		return gas;
	}

	
	public void setGas(Gas gas) {
		this.gas = gas;
	}

	
	public int getNumberOfWheels() {
		return numberOfWheels;
	}

	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}

	
	public void frenar() {
		System.out.println(this.getClass().getSimpleName() + 
				" Frenando... ");
		}
	
	//Comportamiento
		public void acelerar() {
			System.out.println(this.getClass().getSimpleName() + 
					" Acelerando...");
		}
		
	
	public boolean isOn(boolean encender) {
		System.out.println(this.getClass().getSimpleName() + 
				" Está encendido? " + encender );
		if(encender) return true; 
		return false;
	}
}
