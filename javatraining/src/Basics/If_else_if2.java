package Basics;

public class If_else_if2 {

	public static void main(String[] args) {
		
		int a = 69;
		if(a<0 || a > 100)
		{
			System.out.println("invalid");
		}
		
			else if (a<40)
			{
				System.out.println("fail");
			}
				else if (a >=40 && a<60)
				{
			System.out.println("2 nd class");
				}
				else if (a > 60 && a < 80)
				{
					System.out.println("1st class");
				}
				else if (a >= 80)
				{ 
					System.out.println("s grade");
		}
			
	}		
}
		


