package javatraining;

import javatraininginstance.instance2;

public class Instance2 {
	String name;
	byte age ;
	float height ;
	

	public static void main(String[] args) {
// person p1 = new person ();
// person p2 = new person();
		
		instance p1 = new instance2();
		instance p2 = new instance2();
		
		p1.name="raj";
		p1.age = 20;
		p1.height =12.6;
		System.out.println(p1.name +   p1.age   +   p1.height);
	}

}
