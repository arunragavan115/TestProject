package String_Concepts;
import java.util.Scanner;

public class String2 {

	public static void main(String[] args) {
		
		//Literals
		String a = "hello";
		String b = "hello";
		System.out.println(a == b); //true
		
		//objects
		
		String c = new String("hello");
		String d = new String("hello"); 
		System.out.println(c == d);//false
		
		System.out.println(c.equals(d));// true
	}

}
