package Basics;

public class Op_ternary {

	public static void main(String[] args) {
		
		int a = 14;  //9
		int b = 11;  //17
		int c;
		int d = 12;
		
		boolean bl;
		
		
		c = a<b ? 20 : 10;
		System.out.println(c);
		
		
		c = a < b ? a + 20 : b + 10; //(a>b)? (a+20):(b+10);
		System.out.println(c);
		
		bl = a < b ? a > 5? a < b : a > 5 : a > d ? a < 10: a > d;
		
		System.out.println(bl);

	}

}
