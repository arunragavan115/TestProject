package Basics;

public class Op_percedence {
	public static void main(String[] args) {
	
	
	int b;
	
	 
	b = 2 *20 + 11 / 2 * 7 ;  //(20 *2) + ((11 / 2 * 7);
	System.out.println(b);
	
	b = 2 - 20 + 11 / 2 * 7;  //(2 - 20) + ((11/ 2 * 7);
	System.out.println(b);
	
	int i = 1, j = 2, k = 3;
	
	b = i * j-- + 20 * j + ++k * 7;
	System.out.println(b);
	
	i = 1; j = 2; k = 3;
	b = i * j-- + 20 * j + ++k * 7 | 56 & 59;
	System.out.println(b);
	
	

}
}
