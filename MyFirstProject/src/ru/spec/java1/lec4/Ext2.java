package ru.spec.java1.lec4;

public class Ext2 extends Ext {


	int age = 3;
	
	public Ext2() {
		System.out.println("Ext2()");
		
		System.out.println(super.equals(this));
	}
	
	@Override
	void f() {
		System.out.println("Ext2.m()");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
