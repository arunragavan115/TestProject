package Abstraction;

public abstract class Car {

	// when a class did not give implement details  called abstract method
	
	//when a class have 10 methods if 1 method is abstract means whole class is abstract class only

	public abstract void engineSecret();
	
	//if a class is having, an unimplemented method,then the method should be declared abstract
	
	public abstract void companyVault(); 

	public void employees() {
		System.out.println("employee"); //this is implementation details 
	}
}

//can v create object for abstract class ???  definitely nooooo