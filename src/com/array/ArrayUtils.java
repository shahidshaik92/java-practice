package com.array;

public class ArrayUtils {

	public static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + "");
		}
	}

	public static void printArrayReverse(int arr[]) {
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.println(arr[i] + "");

		}
	}

}
