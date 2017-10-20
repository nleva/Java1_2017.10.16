package ru.spec.java1.lec5;

public class Outter {

	private int i;
	
	
	public static class StaticNested extends Outter{
		public StaticNested() {
		}

		public int getI() {
			return ((Outter)this).i;
		}
		
	}
	
	
	public class Nested {
		public Nested() {
			i=5;
		}
		
	}
	
	
	public static void main(String[] args) {
//		new ru.spec.java1.lec5.Outter();
		new ru.spec.java1.lec5.Outter.StaticNested();
		
		System.out.println(new StaticNested().getI());
		
		Outter outter = new Outter();
		outter.new Nested();
		
		for(int i=0;i<10;i++) {
			final int tmp = i;
			class Inner{
				public void m() {
					System.out.println(tmp);
				}
				
			}
			new Inner().m();
			class Bing extends WebSite{

				@Override
				public String getTitle() {
					return "Bing";
				}
				
			}
			new Bing();
			
			WebSite site = new WebSite() {
				
				@Override
				public String getTitle() {
					return "Yahoo";
				}
			};
			
			
			
		}
		

	}

}
