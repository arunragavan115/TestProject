package Polymorphism;

public class Son extends Parents{
	
	//overriding example
	//when a childclass not satisfied by the implementation provider by the parent class
	//overriding happens at runtime ,,no change in anything
	
	  @Override public void marriage() {
	  System.out.println("my marriage my rules"); 
	  }

	public static void main(String[] args) {
		
		Parents parents =new Son(); //parentclass ref =new childclass();
		parents.properties();
		parents.marriage();
		
	}

}
