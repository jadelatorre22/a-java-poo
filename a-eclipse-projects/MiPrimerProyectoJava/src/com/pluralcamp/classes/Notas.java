package com.pluralcamp.classes;

public class Notas {

	//METODOS (FUNCIONES)
	static void notaMaxima(double[] cualificaciones){
        double max = cualificaciones [0];
        for(int index = 0; index < cualificaciones.length; index++)
           if(cualificaciones[index] > max)
             max = cualificaciones[index];
    System.out.println("Nota máxima de esta Aula: " + max);
    } 

   static void notaMinima(double[] cualificaciones){
        double min = cualificaciones [0];
        for(int index = 0; index < cualificaciones.length; index++)
           if(cualificaciones[index] < min)
             min = cualificaciones[index];
    System.out.println("Nota mínima de esta Aula: " + min);
    } 
   
   static void printMaxMin(double[] notas, int aula) {
		System.out.printf("Aula %d: ----- %n", aula);
		notaMaxima(notas);
		notaMinima(notas);
		System.out.println("");
	}
}
