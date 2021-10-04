package com.JavaTraining;

public class for_loop_practice  extends Parameter_Example{
void partha()
	{
		int a=9,b=7,c=8;
		while(a>b) {
			if(b==8) 
				System.out.println("if condition satisfied--"+b);
			else {
				System.out.println("ok");
			}
			System.out.println("while loop---"+b);
			b++;

		}

		for(int i=1;i<9;i++) {
			System.out.println("for loop----"+i);

		}


	}

}