package com.array;

public class PositiveNegativeExample {
	public static void main(String[] args) {
		int array[] = { 1, 2, 3, -1, -2, -3,0 };
		System.out.println("given positive numbers");
		for (int i = 0; i < array.length; i++) {
			if (array[i] > 0) {
				System.out.println(array[i]);
			}

			
		}
		System.out.println("given negative number");
		for (int i = 0; i < array.length; i++) {
			if (array[i] <=0) {
				System.out.println(array[i]);
			
				
			}
		
	}

}
}
