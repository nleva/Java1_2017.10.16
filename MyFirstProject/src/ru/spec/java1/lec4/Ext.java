package ru.spec.java1.lec4;

public class Ext extends Base{
	
	String title="123";

	int age = 2;
	
	public Ext() {
		super("asd");
		//init title
		System.out.println("Ext()");
		f();
		super.f();
	}

	@Override
	void f() {
		System.out.println("Ext.m() "+title);
	}
}
