package com;

public class Main {
	
	public static void main(String []args) {
		
		System.out.println("Printing the pattern..............");
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
