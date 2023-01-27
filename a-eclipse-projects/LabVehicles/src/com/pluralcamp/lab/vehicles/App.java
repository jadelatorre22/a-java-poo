package com.pluralcamp.lab.vehicles;

public class App {

	public static void main(String[] args) {
		
	Car coche = new Car();
	//coche.acelerar();
	
	 
	 Motorcycle moto = new Motorcycle();
	 //moto.isOn(false);
	 
	 
	 Bus autobus = new Bus();
	 //autobus.frenar();

	 
	 Train tren = new Train();
	 //tren.frenar();
	 
	 
	Vehicle vehiculos[] = new Vehicle [] {coche, moto, autobus, tren};
	for (Vehicle vehiculo: vehiculos) {
		if (vehiculo instanceof Bus)
			vehiculo.acelerar();
		else if (vehiculo instanceof Train)
			vehiculo.frenar();
		else
			vehiculo.isOn(true);
//	System.out.println(vehiculo.getClass());
	}
	
	//vehiculos[1].acelerar();
	
	
	Polluter contaminantes[] = new Polluter[] {coche,moto,autobus};
	for (Polluter contamina: contaminantes) {
		contamina.expulsaCO2();
		contamina.carburant();
//		System.out.println(contaminadora.getClass());
	}
	
	}
	
}
