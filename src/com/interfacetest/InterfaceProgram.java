package com.interfacetest;

public class InterfaceProgram {

	
	public static void main(String[] args) {
		
		
		InterfaceA objB = new ClassB();
		objB.hello();
		
		InterfaceA objA = new ClassA();
		objA.hello();
	}
}
