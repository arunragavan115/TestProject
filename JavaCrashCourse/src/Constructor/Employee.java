package Constructor;

public class Employee {

	int Employeeid;
	String Employeename;

	// define a N0 ARGUMENT[args] constructor or NON parameterized constructor
	 Employee() {
		Employeeid = 1;
		Employeename = "arun";
		System.out.println("Employee object is created  "+ Employeename);
	}
	
	public static void main(String[] args) {

		Employee employee = new Employee();
		
		
	}

}
