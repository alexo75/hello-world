package main;

import java.util.Date;

public class helloworld {
	
	public static void main(String[] args) {	
        Runtime memCalc = Runtime.getRuntime();
        getDate();
		
        System.out.println("Total memory is: " + memCalc.totalMemory());
        System.out.println("Free memory is: " + memCalc.freeMemory());
		System.out.println("Hello Worlde");
		System.out.println("Hello Alice!");
		System.out.println("Hey Bob!");
		System.out.println("Greetings Charlie!");
		System.out.println("Howdy Denise!");
		System.out.println("Bonjour Ester!");
		System.out.println("Fare thee well!");

	}

private static void getDate() {
		  {
		        Date dateAndTime = new Date();
		        System.out.println("Current date and time is " + dateAndTime);
		  }
	}
}