package com.student;

class Student {
	int id;
	String name;
}

class Teacher {
	int id = 888;
	String name;
}

public class TestStudent1 {

	public static void main(String[] args) {
		System.out.println("------Student -------");

		Student s = new Student();
		System.out.println(s.id);
		System.out.println(s.name);
		System.out.println("------Teacher 1-------");
		Teacher teacher1 = new Teacher();
		teacher1.id = 79;
		teacher1.name = "jakas";
		System.out.println(teacher1.id);
		System.out.println(teacher1.name);

		System.out.println("------Teacher 2" + "-------");

		Teacher teacher2 = new Teacher();
		teacher2.id = 749;
		teacher2.name = "rgv";
		System.out.println(teacher2.id);
		System.out.println(teacher2.name);

	}
}
