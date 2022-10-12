package com.polymorphism;

class Adder {
	public static int add(int i) {
		return i;
	}

	public static int add(int a, int b) {
		return a + b;
	}

	public static double add1(int a, int b) {
		return a + b;
	}

	static int add(int a, int b, int c) {
		return a + b + c;
	}

	public static int add(int i, int j, int k, int l) {
		return i + j + k + l;
	}

	public static int add(String name, int j, int k, int l) {
		System.out.println(name);
		return j + k + l;
	}

}

class MethodOverloadingExample1 {
	public static void main(String[] args) {
		System.out.println(Adder.add(9));
		System.out.println(Adder.add(9, 2));
		System.out.println(Adder.add(2, 3, 5));
		System.out.println(Adder.add(2, 3, 5, 8));
		System.out.println(Adder.add(0, 4, 5, 7));
		System.out.println(Adder.add(1, 1, 1, 1));
		System.out.println(Adder.add("hi", 1, 1, 1));

		/*
		 * Q) Why Method Overloading is not possible by changing the return type of
		 * method only? In java, method overloading is not possible by changing the
		 * return type of the method only because of ambiguity. Let's see how ambiguity
		 * may occur:
		 */

	}
}
