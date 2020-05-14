package Basics;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			char ch;
			Scanner in= new Scanner(System.in);
			
			System.out.println("enter the char");
			ch= in.next().charAt(0);
			
			switch(ch){
			case 'a':
				System.out.println("alphabet");
				break;
				
			case 'b':
				System.out.println("alphabet");
				break;
				
			case 'c':
				System.out.println("alphabet");
				break;
				
			case '1':
				System.out.println("numeric");
				break;
				
			case '2':
				System.out.println("numeric");
				break;
				
			case '3':
				System.out.println("numeric");
				break;
				
			case '\'':
				System.out.println("special charcter");
				break;
				
			default:
				System.out.println("others");
				
			
			
			
	}

	}
}
