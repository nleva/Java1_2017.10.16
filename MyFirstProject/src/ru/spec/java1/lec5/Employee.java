package ru.spec.java1.lec5;

public class Employee {

	String name;
	String title;
	{
		age=5;
		System.out.println("init");
		
	}
	int age;
	
	final int MAX;
	
	static {
		System.out.println("static init");
		System.exit(0);
	}

	public Employee( String name, String title, int age) {
		super();
		this.name = name.replaceAll("\\s+", "");
		this.title = title;
		System.out.println("Employee(...)");
		MAX=100/2;
//		this.age = age;
	}
	
	public Employee(String name, int age) {
		this(name,null,age);
	}



	public static void main(final String[] args) {
		
		final int array[] = {1,2,3,4,5};
		array[0]=0;
//		array=new int[10];
		
		
		
		
		
		System.out.println("START");
		new Employee("name","title",0);
		Employee employee = new Employee("123",0);
		System.out.println(employee.age);
		System.out.println("STOP");

	}

}
