package Oops_Inheritance1;

 class superr {
	
	int x = 10;
	int y =20;
	
	void PrintData() {
		System.out.println(x);
		System.out.println(y);
	}
}
class Color1 extends superr{
	int colorr = 1;
	
	void PrintData() {
		super.PrintData();
		System.out.println(colorr);
		
	}
}
public class Color {
	
	public  static void main(String[] args) {
		Color1 c1 = new Color1();
		c1.PrintData();
	}
	}
	


