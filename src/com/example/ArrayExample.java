package com.example;

public class ArrayExample {
	public static void main(String[] arg) {
		int[] arr = new int[] { 1, 2, 3, 4, 5 };
		System.out.println("given array");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + "");
		}
		System.out.println();

		System.out.println("Reverse array");
		for (int i= arr.length-1;i>=0; i--) {
			System.out.println(arr[i] + "");

		}

	}
}
