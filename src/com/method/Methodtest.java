package com.method;

class TempTest {
	void swap(int par1, int par2) {
		System.out.println(par1 + "--------" + par2);

		int temp1;

		temp1 = par1;
		par1 = par2;
		par2 = temp1;
		System.out.println(par1 + "--------" + par2);
	}
}

class MultiplicationTest {

	protected int multiplication(int par1, int par2) {
		int multiValue = par1 * par2;
		return multiValue;
	}

	int multiplicationHack(int par1, int par2) {
		int multiValueHack = multiplication(par1, par2);
		return multiValueHack;
	}

}

class StringTest {

	String fullName(String firstName, String lastName) {
		String fullName = firstName + " " + lastName;
		return fullName;
	}

	public String reverse(String parameter) {

		int length = parameter.length();

		char[] ch = parameter.toCharArray();
		String reverse = new String();
		for (int i = length - 1; i >= 0; i--) {
			reverse += ch[i];
		}
		return reverse;
	}

}

public class Methodtest {

	public static void main(String arg[]) {

		TempTest swap = new TempTest();
		swap.swap(10, 20);
		swap.swap(1000, 200000);
		swap.swap(1, 2);
		System.out.println("-----------------------------------------------");
		MultiplicationTest multiObj = new MultiplicationTest();
		int mValue1 = multiObj.multiplicationHack(0, 0);
		int mValue2 = multiObj.multiplicationHack(10, 10);
		System.out.println(mValue1);
		System.out.println(mValue2);
		System.out.println("-----------------------------------------------");
		StringTest nmeObject = new StringTest();
		String name = nmeObject.fullName("shaik", "sajid");
		System.out.println(name);
		System.out.println("-----------------------------------------------");
		StringBuffer s = new StringBuffer("hello");
		System.out.println(s.reverse());
		
		System.out.println(Math.max(9,7));
		
		System.out.println("-----------------------------------------------");

		String output = nmeObject.reverse("sajid");
		System.out.println(output);

	}
}	


