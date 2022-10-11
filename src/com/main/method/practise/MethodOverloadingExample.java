package com.main.method.practise;

public class MethodOverloadingExample {

	public static void main(String name) {
		System.out.println("This is main method but it is a string");
	}

	public static void main(int a) {
		System.out.println("This is a main method but it is a int");
	}

	public static void main(String[] args) {
		System.out.println("This is a main method");

		MethodOverloadingExample.main(1223);
		MethodOverloadingExample.main("ladakh");

	}

}
