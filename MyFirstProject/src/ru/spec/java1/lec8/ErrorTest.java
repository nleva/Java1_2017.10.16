package ru.spec.java1.lec8;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ErrorTest {

	
	
	public static void main(String[] args) {
		System.out.println("START");
		//TODO try()
		//TODO finally
		//         return
		//         throw
		

		System.out.println("login:");
		try(Scanner scanner = new Scanner(System.in)){
			String nextLine = scanner.nextLine();
			System.out.println(nextLine);
		}
//		
//		System.out.println("password:");
//		try(Scanner scanner = new Scanner(System.in)){
//			String nextLine = scanner.nextLine();
//			System.out.println(nextLine);
//		}
		
//		System.out.println("END");

	}

	private static int m1() {
		File f = new File("C:/java/new.txt");
		
		try(FileOutputStream fos = new FileOutputStream(f)) {
			fos.write("hello world".getBytes());
			return 3;
//			throw new Exception("My exception");
		}catch (Exception notImpotant) {
		}
		return 1;
	}

}
