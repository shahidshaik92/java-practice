package com.constructor;

public class ParameterisedConstructorTest {
	int roll;
	String name;

	ParameterisedConstructorTest(int r, String s) {
		roll = r;
		name = s;
	}

	void display() {
		System.out.println(roll);
		System.out.println(name);
	}

	public static void main(String[] args) {
		ParameterisedConstructorTest p = new ParameterisedConstructorTest(2, "Sajid");
		p.display();

		ParameterisedConstructorTest p1 = new ParameterisedConstructorTest(3, "Baba");
		p1.display();


	}

}
