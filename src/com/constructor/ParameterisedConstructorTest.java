package com.constructor;

public class ParameterisedConstructorTest {

	int productId;
	String productName;
	static String productSize = "20 size";
	
	
	ParameterisedConstructorTest() {
		System.out.println("Default Constructor is invoked");
	}

	ParameterisedConstructorTest(int r, String n) {
		productId = r;
		productName = n;
		display();
	}

	void display() {
		System.out.println(productId + " " + productName +" "+ productSize);
	}

	public static void main(String[] args) {
		System.out.println("hello, iphone user");
		ParameterisedConstructorTest p1 = new ParameterisedConstructorTest(2, "iphone12");
		ParameterisedConstructorTest p2 = new ParameterisedConstructorTest(3, "iphone13");
		ParameterisedConstructorTest p3 = new ParameterisedConstructorTest(4, "iphone14");

		ParameterisedConstructorTest defaultCon = new ParameterisedConstructorTest();
		
		System.out.println(p1.productId);

	}

}
