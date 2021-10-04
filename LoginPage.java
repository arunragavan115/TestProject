package com.JavaTraining;

public class LoginPage {

	//Parameter Constructor
	LoginPage(int a,int b){					
		int c=a+b;						
		System.out.println(c);		

	}

	LoginPage(String a,String b,String c) {
		String p="manivel";
		System.out.println(c);

	}

	void kumar() {
		int a=9, b=a-2;
		System.out.println(b);

	}
	public static void main(String[] args) {

		LoginPage obn=new LoginPage(12,17);  //parameter Constructor 
		LoginPage okn=new LoginPage("arun","ragavan","null");  ////parameter Constructor 
		obn.kumar();
		okn.kumar();
		

	}

}
