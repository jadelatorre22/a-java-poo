package com.pluralcamp.exceptions;

//import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class ListOfNumbers {
	
	private List<Integer> list;
	
	static final int SIZE = 10;
	
	
	public ListOfNumbers () {
		list = new ArrayList<Integer>(SIZE);
		
		for(int i = 0; i < SIZE; i++) {
			this.list.add(i * 3);
		}
			
	}
	
	public void writeList() throws MaintenanceException {
		FileWriter writer;
		
		try {
			writer = new FileWriter("Out.File.txt");
			PrintWriter out = new PrintWriter (writer);
			//PrintWriter out = new PrinterWriter (new FileWriter("Out.File.txt"));
			for (int i = 0; i < SIZE; i++) {
			out.println("Value at: " + i + " = " + list.get(i));
				
				}
			out.close();
		
//			} catch (FileNotFoundException ex) {
//				System.out.println(ex.getMessage());
				
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			//System.err.println(e.getMessage());
			throw new MaintenanceException("Mantenimiento "
					+ "(Comprando Monsters)");
//			try {
//				throw new MaintenanceException("Mantenimiento "
//					+ "(Comprando Monsters)");
//			} catch (MaintenanceException ex) {
//				System.out.println(ex.getMessage());
//			}
			
		} 
	}

}
