package Oops;

public class Inheritance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		B b = new B();

		a.setA(125);
		a.print();

		b.setA(250);
		b.print();

	}

}

class A{					// parent class A
	int i;
	void setA(int x) {
		i = x;
	}
	void print() {
		System.out.println(i);
	}
}
class B extends A{  		// if extends is using class b calls class a.   // child class B

}
