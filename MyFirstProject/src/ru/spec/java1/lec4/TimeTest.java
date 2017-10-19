package ru.spec.java1.lec4;

import java.util.Date;

public class TimeTest {

	public static void main(String[] args) {
		for (int i = 0; i < 100; i++)
			test();

	}

	private static void test() {
		long millis = System.currentTimeMillis();
		long nano = System.nanoTime() / 1000_000;
		long ts = System.nanoTime();
		System.out.println(millis);
		System.out.println(nano);

		long startTime = millis - nano;
		System.out.println(new Date(startTime));
//		System.out.println(System.currentTimeMillis() - millis);
		System.out.println(System.nanoTime() - ts+"ns");
	}

}
