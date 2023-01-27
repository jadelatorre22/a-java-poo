package com.labcole.classes;

import java.util.Date;

public interface Worker {

	void getPayment();
	
	default void clockIn() { 
		Date date = new Date();
		System.out.printf("He fichado %1$tA, %1$td %1$tB %1$tY en %tT%n", date);
	
	}
		
		
	
}
