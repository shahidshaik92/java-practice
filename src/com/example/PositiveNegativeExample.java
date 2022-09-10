package com.example;

public class PositiveNegativeExample {
	public static void main(String[] args) {
		int array[] = { 1, 2, 3, 0, -1, -4, -6 };
		System.out.println("Given positive numbers");
		int i, positive = 0, negative = 0;
		for (i = 0; i < array.length; i++) {
			if (array[i] > 0) {
				positive = positive + 1;
			}
		}
		System.out.println(positive);
		System.out.println("Given negative numbers");
		for (i = 0; i < array.length; i++) {
			if (array[i] < 0) {
				negative = negative + 1;
			}
		}
		System.out.println(negative);

	}

}
