package Basics;

public class While_Loop_return {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		
		while(i<=20) {
			if(i ==9)
				return;							// condition
			System.out.println(i++);
		}
		System.out.println("endof loop"); 
		

	}

}
