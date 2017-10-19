package ru.spec.java1.lec4;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

public class TimeTest {

	public static void main(String[] args) {
		for (int i = 0; i < 100; i++)
			test(); 

	}

	private static void test() {
		long ts = System.nanoTime();
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=0 ; i < 100_000; i++) {
			list.add(list.size()/2,i);
		}
//		System.out.println(System.currentTimeMillis() - millis);
		System.out.println((System.nanoTime() - ts)/1000/1000d+"ms "+list.size());
	}

}
