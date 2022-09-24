package com.thispractice;

public class ThisTest {

	int productId;
	String productName;
	

	ThisTest(int productId, String productName) {
		this.productId = productId;
		this.productName = productName;
		display();
	}

	public ThisTest() {
		System.out.println("Default Constructor is invoked");
	}

	void display() {
		int s = 2;
		System.out.println(productId + " " + productName);
	}

	public static void main(String[] args) {
		System.out.println("hello, iphone user");
		ThisTest p = new ThisTest(2, "iphone12");
		ThisTest p1 = new ThisTest(3, "iphone13");
		ThisTest p2 = new ThisTest(4, "iphone14");

		ThisTest defaultCon = new ThisTest();

	}

}
