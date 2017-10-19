package ru.spec.java1.lec2;

import java.math.BigInteger;
import java.util.Date;

public class EntryPoint {

	public static void main(String[] args) {

//		fib();
		
		System.out.println(Math.pow(2.5, -3.3332));
		int max = 10;
//		int[] ints = new int[max];
		int[] ints = {1,2,3,4,5,6};
		for (int i : ints) {
			System.out.println(i);
		}
		
	}

	private static void fib() {
		long a = 1, b = 1, c; // 1 1 2 3 5 8 13 21

		BigInteger i1=new BigInteger("1"),i2=new BigInteger("1"),i3;
		
		for (int i = 1; i <= 100; i++) {
			System.out.println("("+i+")="+i1);
			i3=i1.add(i2);
			i1=i2;
			i2=i3;
//			c=a+b;
//			a=b;
//			b=c;
			//  a b c
			//    a b c
		}
	}

}
