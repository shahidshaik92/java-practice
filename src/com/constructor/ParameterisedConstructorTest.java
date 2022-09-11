package com.constructor;

public class ParameterisedConstructorTest {

	int productId;
	String productName;

	ParameterisedConstructorTest(int r, String n) {
		productId = r;
		productName = n;
		display();
	}

	public ParameterisedConstructorTest() {
		System.out.println("Default Constructor is invoked");
	}

	void display() {
		System.out.println(productId + " " + productName);
	}

	public static void main(String[] args) {
		System.out.println("hello, iphone user");
		ParameterisedConstructorTest p = new ParameterisedConstructorTest(2, "iphone12");
		ParameterisedConstructorTest p1 = new ParameterisedConstructorTest(3, "iphone13");
		ParameterisedConstructorTest p2 = new ParameterisedConstructorTest(4, "iphone14");

		ParameterisedConstructorTest defaultCon = new ParameterisedConstructorTest();

	}

}
