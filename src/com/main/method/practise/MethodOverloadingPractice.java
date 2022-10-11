package com.main.method.practise;

class Summer {
	public static double sum(double a, double b) {
		return a + b;
	}

	public static int sum(int a) {
		return a;
	}

	public static int sum(String name, int a) {
		System.out.println(name);
		return a;
	}

	public static int sum(int a, int b, int c, int d) {
		return a + b + c + d;
	}

}

public class MethodOverloadingPractice {
	public static void main(String[] args) {
		System.out.println(Summer.sum(2.5, 3.5));
		System.out.println(Summer.sum(3));
		System.out.println(Summer.sum("ladakh", 2));
		System.out.println(Summer.sum(1, 2, 3, 4));
	}
}
