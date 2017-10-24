package ru.spec.java1.lec6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FilesTest {
	public static void main(String[] args) throws Exception {
//		System.out.println("enter any string:");

		InputStream in = System.in;

		File file = new File("C:/java/test.txt");
		in = new FileInputStream(file);
//		in = new URL("http://specialist.ru").openStream();
		
		
		Scanner scanner = new Scanner(in);

		Map<String, Integer> stat = new HashMap<>();
		
		for (; scanner.hasNextLine();) {
			String[] nextLine = scanner.nextLine().toLowerCase().split("[^а-яё]+");// авы 234 ыва
			//for
//			System.out.println(nextLine);
		}
1718                InputStream in = System.in;1920                File file = new File("C:/java/test.txt");21                in = new FileInputStream(file);22//              in = new URL("http://specialist.ru").openStream();23                24                25                Scanner scanner = new Scanner(in);2627                Map<String, Integer> stat = new HashMap<>();28                29                for (; scanner.hasNextLine();) {30                        String[] nextLine = scanner.nextLine().toLowerCase().split("[^а-яё]+");// авы 234 ыва31                        //for32//                      System.out.println(nextLine);


		
		

	}
}
