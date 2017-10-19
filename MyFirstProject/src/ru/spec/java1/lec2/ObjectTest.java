package ru.spec.java1.lec2;

import java.util.Date;

public class ObjectTest {

	public static void main(String[] args) {
		System.out.println("hello world "+ObjectTest.class.getName());
		int i = 5;
		Integer i1 = 5;
		
		Boolean b = null;
		

		double d1 = 0d/0;
		double d2 = 0d/0;
		System.out.println(d1==d2);
		System.out.println(Double.isNaN(d1));
		System.out.println((-5) % 3);

		byte b1 = 127;
		byte b2 = (byte)(b1-1);
		System.out.println(b1);//127
		System.out.println(b1+1);//128
		System.out.println(b1+b2);//128
		System.out.println(b1++);//127
		System.out.println(b1);//
		System.out.println(++b1);//
		
		char c = 66;
		System.out.println(c);
		System.out.println((char)(c+10));
		System.out.println(c+" = A");
		System.out.println(c+'='+'A');
		
		int k = '\t';
		
		
		
		

	}

}
