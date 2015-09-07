package com.ptc.salestool;

public class Main {
	public static void main(String[] args){
		SalesData data = new SalesData();
		
		displayGreeting();
		data.display();
	}
	
	private static void displayGreeting() {
		System.out.println("Hellow Happy Sales People!");
		System.out.println("This App shows Sales Data");
		
		System.out.println("Test 1");
		System.out.println("Test 2");
	}
}
