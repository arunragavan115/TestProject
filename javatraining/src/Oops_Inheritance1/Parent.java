package Oops_Inheritance1;

public class Parent {
	protected int p = 20;
}

class child1 extends Parent{
	
	public static void main(String[] args) {
		Parent p = new Parent();
			child1 c = new child1();
			
			System.out.println(p.p);
			System.out.println(c.p);
		}

	}


