package ru.spec.java1.lec8;

import java.util.concurrent.TimeUnit;

public class SwitchTest {

	static final String type = "asd";

	public static void main(String[] args) throws InterruptedException {
		long k = 1;
		Menu item = Menu.PROJECT_1_1;
System.out.println(item);
		select(item);
		
		Menu.PROJECTS.run();
		
		TimeUnit.SECONDS.sleep(5);
	}

	private static void select(Menu item) {
		switch (item) {
		case ABOUT:
			System.out.println(item.toString());
			System.out.println(item.name());
			break;
		case CONTACTS:
			break;
		case MAIN:
			System.out.println("hello");
			break;
		case PROJECTS:
			break;
		}
	}
}
