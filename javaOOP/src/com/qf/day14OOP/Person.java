package com.qf.day14OOP;

public class Person {
	String name;
	int age;
	
	public Person(){
		
	}
	
	public Person(int age,String name){
		this.name=name;
		this.age=age;
	}
	
	public void eat(){
		System.out.println("吃饭啦。。。");
	}
}
