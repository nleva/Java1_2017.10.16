package ru.spec.java1.lec4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class WordsCount {

	public static void main(String[] args) {
		String s1 = "  fsdfh sdhfgsfh     sdhfgdhfsdg fsghdf sdghfvs dfvdghfv sd sd sd sd  ";
		String s2 = "  123 werfwe 222 333 444 444 444 sd sd sd sd  ";
		

		ArrayList<String> strings = new ArrayList<>();
		
		TreeSet<String> set = new TreeSet<>();
		

		addWordsToArray(s1, strings);
		addWordsToArray(s2, strings);
		
		set.addAll(strings);
		
		for (String word : set) {
			System.out.println(word);
		}
		System.out.println(set.size());
		

	}

	private static void addWordsToArray(String str, ArrayList<String> strings) {
		String[] split = str.trim().split("\\s+");
		strings.addAll(Arrays.asList(split));
	}

}
