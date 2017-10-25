package ru.spec.java1.lec5;

import java.util.ArrayList;

public class MySite implements Site {

	@Override
	public String getName() {
		return "MySite";
	}

	static interface Proccess {
		void proc(Integer i);
	}

	public static void main(String[] args) {
		System.out.println(new MySite().getTitle());

		ArrayList<Integer> ints = new ArrayList<>();
		ints.add(1);
		ints.add(3);
		ints.add(4);
		ints.add(6);
		ints.add(8);
		Proccess printBin = new Proccess() {
			@Override
			public void proc(Integer i) {
				System.out.println(Integer.toBinaryString(i));

			}
		};
		Proccess printHex = new Proccess() {
			@Override
			public void proc(Integer i) {
				System.out.println(Integer.toHexString(i));

			}
		};

		printHex = (Integer i) -> {
			System.out.println(Integer.toHexString(i));
		};

		printHex = i -> System.out.println(Integer.toHexString(i));

		Proccess toOct = Integer::toOctalString;

		// forEach(ints, printBin);
		// forEach(ints, printHex);
		// forEach(ints, var->System.out.println(Integer.toOctalString(var)) );
		// forEach(ints, Integer::toOctalString );
		// forEach123(ints, System.out::println);

		ints.forEach(System.out::println);

OUTTER: for (Integer x : ints) {

			for (Integer y : ints) {
				if (y < 5)
					break OUTTER;
				
				switch (y) {
				case 1:
					
					break;
				case 2:
					
					break;
				case 3:
					
					break;

				default:
					break;
				}
				System.out.println(x * y);
			}

		}
		
	

	}

	static void forEach123(ArrayList<Integer> list, Proccess p) {
		for (Integer integer : list) {
			p.proc(integer);
		}
	}

}
