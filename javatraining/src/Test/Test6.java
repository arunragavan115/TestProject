package Test;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		
		// Write a Java program that gets a day (0 to 1000000000) and displays the name of the weekday using switch case. 

		int day;
		Scanner in = new Scanner (System.in);
		System.out.println(" enter a week day(0 to 6):");
		day=in.nextInt();
		
		if(day <0 || day>6) {
			System.out.println(" invalid week day.");
			System.exit(0);
		}
		
		switch(day){
        case 0: 
            System.out.println("Sunday");
            break;
        case 1: 
            System.out.println("Monday");
            break;
        case 2: 
            System.out.println("Tuesday");
            break;
        case 3: 
            System.out.println("Wednesday");
            break;
        case 4: 
            System.out.println("Thursday");
            break;
        case 5: 
            System.out.println("Friday");
            break;
        case 6: 
            System.out.println("Saturday");
            break;                  
        default:
            System.out.println("Invalid");
            break;                  
		
		
	}
		}
}

