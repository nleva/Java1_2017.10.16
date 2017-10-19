package ru.spec.java1.lec3;

public class Block {

	int i;
	static int count;
	
	public Block(int i) {
		super();
		this.i=i;
		System.out.println("new Block");
		count++;
	}

	void sayHello() {
		System.out.println("hello "+this.i);
//		i;
	}
	
	static void sayBye(Block self) {
		System.out.println("bye "+self);
	}
	
	public static void main(String[] args) {
//		i=5;
		
		for (int i = 0; i < 10; i++) {
			Block block = new Block(5);
			block.sayHello();
		}
		System.out.println(Block.count);

	}

}
