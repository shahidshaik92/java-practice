package com.polymorphism;
//parent
class OverRideTest1 {
	void run() {
		System.out.println("OverRideTest1 run method is invoked");
	}

	void stop() {
		System.out.println("OverRideTest1 stop method is invoked");
	}

	void sleep() {
		System.out.println("OverRideTest1 sleep method is invoked");
	}
}

//child
class OverRideTest2 extends OverRideTest1{
	
	void eat() {
		System.out.println("OverRideTest2 eat method is invoked");
	}

	
	void run() {
		System.out.println("OverRideTest1 run method is invoked");
	}

}


public class MethodOverridingExample1 {

	public static void main(String[] args) {

		OverRideTest2 obj = new OverRideTest2();
		obj.run();
		obj.stop();
		obj.sleep();
		obj.eat();

	}

}
