package ru.spec.java1.lec5;

public class Immutable {

	private String name;

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Immutable(String name) {
		super();
		this.name = name;
	}
	
	
}
