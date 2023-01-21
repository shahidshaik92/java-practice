package com.abstracttest;

abstract class AbstractTest1 {

	void test1() {
		System.out.println("test1");
	}

	abstract void test2();

	AbstractTest1() {
		System.out.println("constructor");
	}
}

class AbstractTest2 extends AbstractTest1 {

	void test2() {
		System.out.println("test2");
	}

}

public class AbstractTesting {

	public static void main(String[] args) {
		AbstractTest1 o = new AbstractTest2();
		o.test1();
		o.test2();
	}

}
