package ru.spec.java1.lec7;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

public class ObjectToFile implements Serializable {
	private static final long serialVersionUID = 2L;
	
	int i=15;
	transient String name;
	
	public static void main(String[] args) throws Exception {
		File f = new File("c:/java/obj.bin");
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream oos = new ObjectOutputStream(baos);
		
		oos.writeObject(new Date());
		
		byte[] byteArray = baos.toByteArray();
		
		System.out.println(byteArray.length);
		
		ByteArrayInputStream bais = new ByteArrayInputStream(byteArray);
		
		
		FileInputStream fileInputStream = new FileInputStream(f);
		ObjectInputStream ois = new ObjectInputStream(bais);
		Object d = ois.readObject();
		System.out.println(d.getClass().getName());
		System.out.println(d);
		
//		baos
		
	}
}
