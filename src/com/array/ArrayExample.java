package com.array;

public class ArrayExample {
	public static void main(String[] arg) {
		int[] arr = new int[] { 1, 2, 3, 4, 5 };
		System.out.println("given array");
		ArrayUtils.printArray(arr);
		System.out.println("Reverse array");
		ArrayUtils.printArrayReverse(arr);
	}
}
