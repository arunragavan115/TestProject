package String_Concepts;
import java.util.Scanner;

public class String5 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("enter the string");

		String str = scan.next();

		System.out.println("enter the search char");
		String c = scan.next();

		char search =c.charAt(0);
		int count =0;

		for(int i = 0; i< str.length(); i++) {
			if(search == str.charAt(i)) {
				count++;
			}

		}
		System.out.println("count is "+ count);


	}

}
