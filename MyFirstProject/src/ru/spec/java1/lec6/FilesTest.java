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
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class FilesTest {
	public static void main(String[] args) throws Exception {
		// System.out.println("enter any string:");

		InputStream in = System.in;

		File file = new File("C:/java/test.txt");
		in = new FileInputStream(file);
		// in = new URL("http://specialist.ru").openStream();

		Scanner scanner = new Scanner(in);

		Map<String, Integer> stat = new HashMap<>();

		for (; scanner.hasNextLine();) {
			String[] nextLine = scanner.nextLine().toLowerCase().split("[^а-яё]+");// авы 234 ыва
			for (String word : nextLine) {
				if(!word.isEmpty()) {
					stat.put(word, 1 + Optional
							.ofNullable(stat.get(word))
							.orElse(0));
//					addWordToStat(word, 2);
					addWordToStat(word, 3);
				}
			}
			// System.out.println(nextLine);
		}
		
//		stat.forEach((k,v)-> System.out.println(k+" - "+v));
		
		Set<Entry<String, Integer>> entrySet = bigrams.entrySet();
		TreeSet<Entry<String, Integer>> sorted 
			= new TreeSet<>((e1,e2)->{
								int cmp = e1.getValue().compareTo(e2.getValue());
								return -1 * (cmp==0?e1.getKey().compareTo(e2.getKey()):cmp);
			});
		sorted.addAll(entrySet);
		sorted.forEach(e->System.out.println(e.getValue()+"\t"+e.getKey()));

		
		Scanner s2 = new Scanner(System.in);
		for(;s2.hasNextLine();) {
			String line = s2.nextLine();
			System.out.println(check(line, 3));
		}
		//ъъ ьъ щщ oo
		//"привет мир" пр ри ив т_ _м _в 
	}
	
	static HashMap<String,Integer> bigrams = new HashMap<>();
	
	static void addStringToStat(String src, int gram) {
		src=src.toLowerCase().replaceAll("[^а-яё]+", " ").trim();// word(_word)*
		String[] words= src.split(" ");
		for (String w : words) {
			addWordToStat(w,gram);
		}
	}
	static void addWordToStat(String word, int gram) {
		int maxLen = word.length()-gram;
		if(maxLen<=0) {
			incrementStat(word);
		}else {
			for(int i=0 ; i<maxLen; i++) {
				String ngram = word.substring(i, i+gram);
				incrementStat(ngram);
			}
			
		}
		
	}
	private static void incrementStat(String ngram) {
		bigrams.put(ngram, 1+Optional
				.ofNullable(bigrams.get(ngram))
				.orElse(0));
	}
	
	static public boolean check(String src, int gram) {
		src= src.toLowerCase().replaceAll("[^а-яё]+", " ").trim();
		int maxLen = src.length()-gram;
		for(int i=0 ; i<maxLen;i++) {
			if(bigrams.get(src.substring(i, i+gram))==null) {
				return false;
			}
		}
		return true;
	}
}






