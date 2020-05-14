package String_Concepts;
import java.util.Scanner;

public class String6 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("enter the string");

		String input = scan.next();

		String reverse ="";

		for(int i = 0; i < input.length(); i++) {
			reverse = input.charAt(i) + reverse;
			//	 System.out.println(input.charAt(i));
		}
		if(input.equals(reverse)) {
			System.out.println("palindrome");
		} else {
			System.out.println("not a palindrome");
		}
	}
}