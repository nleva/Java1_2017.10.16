package ru.spec.java1.lec9;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

public class StreamTest {

	public static void main(String[] args) throws IOException {
		System.out.println("Start:");
		int[] read = {
				System.in.read(),
				System.in.read(),
				System.in.read(),
				System.in.read(),
				System.in.read(),
		};
		System.out.println("end "+read[0]);
		System.out.println("end "+read[1]);
		System.out.println("end "+read[2]);
		System.out.println("end "+read[3]);
		System.out.println("end "+read[4]);
		int available = System.in.available();
		System.out.println(available);
		byte[] buf = new byte[available];
		System.in.read(buf, 0, available);
		
		System.out.println(Arrays.toString(buf));
		System.in.read();
		
		FileInputStream raf = new FileInputStream(new File("c:/java/new.txt"));
		long length = raf.available();
		byte[] bs = new byte[(int)length];
		raf.read(bs);
		
		System.out.println(Arrays.toString(bs));

		System.out.println(raf.read());
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
		System.out.println(raf.read());
		System.out.println(raf.read());
//		raf.seek(0);
	}

}
