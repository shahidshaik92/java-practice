package com.statictest;

class Student {
	int rollno;// instance variable
	String name;
	static String college = "SRM";

	Student(int r, String n) {
		rollno = r;
		name = n;
	}

	void display() {
		System.out.println(rollno + " " + name + " " + college);
	}
}

// Test class to show the values of objects
public class TestStaticVariable {
	public static void main(String args[]) {
		Student s1 = new Student(111, "Karan");
		Student s2 = new Student(222, "Aryan");

		s1.display();
		s2.display();
	}
}
