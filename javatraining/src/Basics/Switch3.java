package Basics;

import java.util.Scanner;

public class Switch3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			char ch;
			Scanner in= new Scanner(System.in);
			
			System.out.println("enter the char");
			ch= in.next().charAt(0);
			
			switch(ch){
			case 'a':
			case 'b':
			case 'c':
			case 'd':
			case 'e':
				System.out.println("alphabet");
				break;
				
			case '0':
			case '1':
			case '2':
			case '3':
			case '4':
			case '5':
			case '6':
			case '7':
			case '8':
			case '9':
				System.out.println("numeric");
				break;
				
				
			case '!':
			case '@':
			case '#':
			case '%':
			case '^':
			case '&':
			case '*':
			case '/':
			case '\"':
			
				System.out.println("special charcater");
				break;
				
				default:
				System.out.println("others");
				
			
			
			
	}

	}
}
