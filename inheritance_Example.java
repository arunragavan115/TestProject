package com.JavaTraining;

public class inheritance_Example extends for_loop_practice {

	//INHERITANCE

	void data() {
		int b=2,c=3,g=0;

		g=b+c;
		System.out.println(g);
	}

	public static void main(String[] args) {

		inheritance_Example obk=new inheritance_Example();  //creating object for childclass for calling parent class
		obk.partha();								//calling another  parent class method here
		obk.arun(10, 20, 20);


	}

}
