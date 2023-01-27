package com.pluralcamp.lab.vehicles;

public class Motorcycle extends Vehicle implements Polluter {

	@Override
	public void expulsaCO2() {
		System.out.println(this.getClass().getSimpleName() + 
				" Contamina con 1.200kg " + "de CO2 al año");
	}
}
