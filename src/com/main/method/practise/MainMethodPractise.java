package com.main.method.practise;

public class MainMethodPractise {

	public static void main(String mame){
		System.out.println("This is main method but String");
	}
	
	public static void main(int a) {
		System.out.println("This is main method but int");
	}
	
	public static void main(String[] args) {
		System.out.println("This is main method");
		
		MainMethodPractise.main(5);
		MainMethodPractise.main("name");
	}

}
