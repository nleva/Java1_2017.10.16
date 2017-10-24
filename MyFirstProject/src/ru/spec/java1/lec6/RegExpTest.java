package ru.spec.java1.lec6;

public class RegExpTest {
	public static void main(String[] args) {
		int i=0;
		i=i++;
		// tmp=0+0=0
		// i=i+1;
		// i=tmp;
		
		i = i++ + i++;
		// tmp = 0
		// i=0+1
		// tmp = tmp+i(1)
		// i=1+1
		// i=tmp
		System.out.println(i); // 1, 0
	}
}
