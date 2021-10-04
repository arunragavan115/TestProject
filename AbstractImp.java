package com.JavaTraining;

public class AbstractImp extends PracticeAbstract {

	void Data() {
		int a=12,b=45,c=45;
		if(a==b) {
			System.out.println(c);
		}
		else {
			System.out.println("nothing");
		}
	}
	
	
	public static void main(String[] args) {
			
		AbstractImp obj =new AbstractImp();
		obj.par();				//calling another nonabstract method here
		obj.Data();				//callingg another abstract class here using same method name

		

	}

}
