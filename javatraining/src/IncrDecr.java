
public class IncrDecr {

	public static void main(String[] args) {
		int a = 20;
		int b = 10;
		int c, d;
		
		c = a++ + ++a;
		d = ++a + a++;
		
		
		System.out.println(a);
		System.out.println(c);
		System.out.println(d);
		
		c = --b - -b--;
		d = b-- - --b;
		
		System.out.println(a);
		System.out.println(c);
		System.out.println(d);
		
	}	
}
