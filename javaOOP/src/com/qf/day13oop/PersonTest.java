package com.qf.day13oop;

public class PersonTest {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name = "李小花";
		p1.age = 18;
		System.out.println("p1:" + p1.age);
		System.out.println("p1:" + p1.name);
		p1.eat();
		p1.sleep();
		Person p2 = new Person();
		p2.name = "王二狗";
		p2.age = 19;
		System.out.println("p2:" + p2.age);
		System.out.println("p2:" + p2.name);
		Person p3 = p1;
		System.out.println("p3:" + p3.age);
		System.out.println("p3:" + p3.name);
		p3.age = 26;
		System.out.println("p3:" + p3.age);
		System.out.println("p1:" + p1.age);
		System.out.println(p1.name);
		p3.name = "王大锤";
		System.out.println(p1.name);
		System.out.println(p3.name);
		p3.eat();
		p2.sleep();
	}

}
