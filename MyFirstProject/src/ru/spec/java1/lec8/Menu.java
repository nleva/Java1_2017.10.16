package ru.spec.java1.lec8;

public enum Menu implements Runnable {
	MAIN("Главная"), 
	PROJECTS("Проекты"){
		@Override
		public void run() {
			System.out.println("Hello world");
		}
	}, 
	PROJECT_1("Проект_1",PROJECTS), 
	PROJECT_1_1("Проект_1_1",PROJECT_1), 
	PROJECT_2("Проект_2",PROJECTS), 
	PROJECT_3("Проект_3",PROJECTS), 
	ABOUT("О нас"), 
	CONTACTS("Контакты");
	

	String title;
	Menu parent;

	private Menu(String title, Menu parent) {
		this.title = title;
		this.parent = parent;
	}
	private Menu(String title) {
		this(title,null);
	}
	
	@Override
	public String toString() {
		return (parent==null?"":(parent.toString()+" >> "))+title;
	}
	@Override
	public void run() {
		
	}
	
	
}
