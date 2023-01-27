package com.pluralcamp.classes;

import java.util.ArrayList;
import java.util.HashMap;
//import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		
		//Pair para representar matriculas
		Person p1 = new Person("Alex", "De la torre");
		Person p2 = new Person("Laura", "Pérez");
		Pair<Integer, Person> matricula1 = new Pair<>(100, p1);
		Pair<Integer, Person> matricula2 = new Pair<>(2374, p2);
		
		System.out.println(matricula1);
		System.out.println(matricula2.toString());
		
		//Pair para representar notas
		Pair<Person, Double> nota1 = new Pair<>(p1, 6.8);
		System.out.println(nota1);
		
		//Pair para representar invitaciones
		Pair<String, Person> invitacion = new Pair<>("653924111",p2);
		System.out.println(invitacion);
		
		System.out.println(" ");
		
		//Fase 3 del ejercicio (Map, List)
		System.out.println("--- Tercera fase del ejercicio Map y List ---");
		
		Map<String, String> dataPersons = new HashMap<>();
	    dataPersons.put("12345678A", "Laura Casamitjana");
	    dataPersons.put("98765439Z", "Josep Casacuberta");
	    dataPersons.put("45645632P", "Miquel Queralt");
	    dataPersons.put("23498755", "Eulalia Forners");
	    dataPersons.put("07651206T", "Abril Nevada");
	    
	    List <Pair<String, Person>> persons;
	    
	    persons = printPersons(dataPersons);
	    
//	    Iterator it = dataPersons.keySet().iterator();
//	    while(it.hasNext()){
//	      String key = (String) it.next();
//	      System.out.println("Clave: " + key + " -> Valor: " + dataPersons.get(key));
//	    }
		
	} //Final método main
	
	
	
	public static List<Pair<String, Person>> printPersons(Map<String, String> data){
	       
		List <Pair<String,Person>> lista = new ArrayList<>();
	
		//En el bucle que recorra el map (inicio del bucle)
		for(Map.Entry<String,String> entry : data.entrySet()) {
		
		String dni = entry.getKey();
		String nombreCompleto = entry.getValue();
		
		String nombre = nombreCompleto.split(" ")[0];
		String apellido = nombreCompleto.split(" ")[1];
		
		Person persona = new Person(nombre,apellido);
		
		Pair<String,Person> par = new Pair<>(dni,persona);
		
		lista.add(par);
		
		} //Hasta aqui fin del bucle
		
		for(Pair<String,Person> pair: lista) {
			System.out.println(pair.toString());
		}
	        return lista; //modifiqueu perquè retorni la List correcte
	        
	}
	
}
