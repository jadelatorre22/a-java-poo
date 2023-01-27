package com.pluralcamp.lab.vehicles;

public class Bus extends Vehicle implements Polluter {

	private int numberOfWheels;

	@Override
	public void expulsaCO2() {
		System.out.println(this.getClass().getSimpleName() + 
				" Contamina con 10 " + "Toneladas de CO2 al año");
	
	}

	public int getNumberOfWheels() {
		return numberOfWheels;
	}

	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}

	
	
}
