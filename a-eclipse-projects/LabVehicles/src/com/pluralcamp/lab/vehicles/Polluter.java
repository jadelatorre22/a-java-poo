package com.pluralcamp.lab.vehicles;

public interface Polluter { //Contaminadora

	 public abstract void expulsaCO2(); 
	 
	 public default void tuboDescape() {
			System.out.println("Expulsa CO2");
			carburant();
		}
	
	default void carburant() {
		System.out.println(Gas.GASOLINE.name());
	}
	
}
