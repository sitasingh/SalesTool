package com.ptc.salestool;

public class Main {
	public static void main(String[] args){
		SalesData data = new SalesData();
		
		displayGreeting();
		data.display();
	}
	
	private static void displayGreeting() {
		System.out.println("Hi Sales Department!");
		System.out.println("This App shows Sales Department Data");
		
		System.out.println("Test 1");
		System.out.println("Test 2");
	}
}
