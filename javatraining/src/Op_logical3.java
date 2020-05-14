
public class Op_logical3 {

	public static void main(String[] args) {
	
		int a = 10;
		int b = 10;
		int c = 11;
		int d = 8;
		
		
		System.out.println((a==b) && (b==c));
		System.out.println((a==b) || (b==c));
		System.out.println((a!=b) && (b<c));
		System.out.println((a>=b) && (b<c));
		
		System.out.println((a==b) || (b==c));
		System.out.println((a>b) || (b<c));
	}

}
