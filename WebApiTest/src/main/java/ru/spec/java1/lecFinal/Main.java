package ru.spec.java1.lecFinal;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
//		new Date().;
		Integer[] array = {1,2,3,4,5,6,7,8,9};
		List<Number> list = Arrays.asList(array);
//		Integer result = list
//				.stream()
//				.filter(i->(i%2)==0)
//				.map(i->i)
////				.
//				.reduce((i,j)->i+j)
//				.orElse(0);
//				.collect(Collectors.toList());
//		System.out.println(result);
		((Integer)list.get(0)).intValue();
		list.get(0).intValue();
		
		Page<Number> page = new Page<>();
		page.setList(list);
		
		Class<Main> clz = Main.class;
		System.out.println(
				Page.create(clz)
				);
		Integer val = Page.getNull();
//		strings.get(0).
//		page.list.get
		
		// Bus.listen(Class::method)
		// List results = Bus.invoke(obj);
		
		
		
		
		

	}

}
