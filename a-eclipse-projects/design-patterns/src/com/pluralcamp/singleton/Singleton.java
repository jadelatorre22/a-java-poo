package com.pluralcamp.singleton;

public class Singleton {

	private static Singleton obj = null;
	private static Object mutex = new Object();
	
	private Singleton() {
		
	}
	
	//tiene que ser static
	public static Singleton getInstance() { 
		synchronized (mutex) { //solo 1 hilo de ejecucion va a poder entrar
			
			if(obj == null) { //Si obj es null
			
			obj = new Singleton(); //me creas un objeto
		}
			}
		return obj; //me devuelves el mismo obj que hay en la variable 
	}
	
}
