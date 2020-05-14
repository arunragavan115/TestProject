package Basics;

import java.util.Scanner;

public class Switch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String str;
			String str2 = "Student";
			Scanner in= new Scanner(System.in);
			
			System.out.println("enter the string:");
			str= in.next();
			
			switch(str){
			case "hell":
				System.out.println(str + str2);
				break;
				
			case "welcome":
				System.out.println(str + str2);
				break;
				
			case "happynewyear":
				System.out.println(str + str2);
				break;
				
				default:
					System.out.println("others");
					break;
			
			
			
	}

	}
}
