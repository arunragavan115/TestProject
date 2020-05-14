import java.util.Scanner;

public class Function3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a num: ");
		int lifeday = in.nextInt();
		
		System.out.println(printDayoftheLifeDay(lifeday));
		
		
		printDayoftheLifeDay(lifeday);
		
	}
		 static String printDayoftheLifeDay(int d){
			 String s = null;
			 
			 switch ( d % 7) {
			 case 0 : System.out.println("sunday");break;
			 case 1 : System.out.println("monday");break;
			 case 2 : System.out.println("tuesday");break;
			 case 3 : System.out.println("thursday");break;
			 case 4 : System.out.println("friday");break;
			 case 5 : System.out.println("saturday");break;
			
			 }
			 return s;
			 
	
						 
			
		 }
}

		