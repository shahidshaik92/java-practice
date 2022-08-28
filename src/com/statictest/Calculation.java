package com.statictest;

public class Calculation {
	
	int parDouble(int par1) {
		return par1 * par1;
	}

	static int cube(int x) {
		return x * x * x;
	}

	public static void main(String args[]) {

		int result = Calculation.cube(5);
		System.out.println(result);
		
		Calculation obj = new Calculation();
		int parDouble = obj.parDouble(6);
		System.out.println(parDouble);
	}
}
