package com.ptc.salestool;

public class SalesData {
	int data[] = {0, 4, 42};
	
	public void display() {
		System.out.println(".........");
		for(int i : data){
			System.out.println("Data : " + data[i]);
		}
	}
}
