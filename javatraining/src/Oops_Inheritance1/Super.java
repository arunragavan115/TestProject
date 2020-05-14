package Oops_Inheritance1;

class arun12{
	int x;
	arun12()
	{
		System.out.println(" native neyveli");
		x =25;
	}

	arun12(int a)
	{
		System.out.println(" native cudd");
		x= a;
	}

	void printX() {
		System.out.println(" x value : " +x);
	}
}

class ragavan extends arun12{

	int y;

	ragavan()
	{
		System.out.println(" native bangalore");
		int y = 30;
	}

	ragavan(int b)
	{
		super(b);
		System.out.println(" lives in poland");
		y = b;
	}

	ragavan(int a, int b)
	{
		super(b);
		System.out.println(" lives in uk");
		y = b;
	}

void printY() {
	 
	System.out.println(" y value : " +y );
}

}

public class Super {

	public static void main(String[] args) {

		arun12 q = new arun12(25);
		ragavan q1 = new ragavan(250);
		ragavan q2 = new ragavan(300,700);

		q.printX();
		
		q1.printX();
		q1.printY();
		
		q2.printX();
		q2.printY();
	}
	

}