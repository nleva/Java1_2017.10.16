package ru.spec.java1.lec3;

public class StringTest {
	
	
	public static void main(String[] args) {
		System.out.println("kldfgj dfjkglnsfdiguh eruilgh 10.11.2007 sldgjndf ilzughdfjkl zgn druiltgdf jlgubr djfhg  lzxcnfg dfuid bvhuzdfgbzdfui g ".trim().replaceAll(".*(?<day>\\d{2})\\.(?<month>\\d{2})\\.(?<year>\\d{4}).*", "${year}"));
		
	}
	
}
