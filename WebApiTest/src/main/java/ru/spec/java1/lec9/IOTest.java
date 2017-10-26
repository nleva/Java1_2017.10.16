package ru.spec.java1.lec9;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

public class IOTest {
	public static void main(String[] args) throws IOException {
		String file = FileUtils.readFileToString(new File("c:/java/new.txt"),"utf-8");
		System.out.println(file);
		FileUtils.write(new File("c:/java/dump/file.txt"), "hello world", "utf-8");
		
		IOUtils.copy(System.in, System.out);
		System.out.println("stop");
	}
}
