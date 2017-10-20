package ru.spec.java1.lec4;

import ru.spec.java1.lec5.Employee;

public class Base{

	String name="123";
	
	int age = 1;
	
	public Base() {
//		super("",0);
		//init fields
		
		System.out.println("Base() name="+name);
//		m();
	}
	
	public Base(String name) {
		this();
		this.name = name;
	}
	
	
	void f() {
		System.out.println("Base.m() " + name);
	}
	
	static String getName(String name) {
		System.out.println("getName("+name+")");
		return name;
	}
	
	public static void main(String[] args) {
		System.out.println("START");
		new Employee("123", 123);
		

	}

}
