package com.JavaTraining;

public class Parameter_Example {

	void arun(int a,int b,int c) {

		 c=a+b;
		System.out.println(c);

	}
	
	void kumar(String m,String n,String q) {
		
		q=n+m;
		
		System.out.println(q);
	}


	public static void main(String[] args) {

		int x=7,y=6,z=0;
		Parameter_Example ragavan=new Parameter_Example();
		ragavan.arun(x, y,z);
		
		
		String l="12", o="@#$%%^",h="";
		ragavan.kumar(l, o, h);
		
		for_loop_practice loop=new for_loop_practice();
		loop.partha();   				 // for_loop_practice program calling here
		
		
	}

}
