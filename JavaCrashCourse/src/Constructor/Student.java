package Constructor;

public class Student {


	String student_name;
	int rollno;
	
	// Example for default constructor.

	public static void main(String[] args) {
		
		Student student= new Student();
		System.out.println(student.student_name);
		//string and integer  is a class so the default value is [null]  {null is provided by default constructor}
		System.out.println(student.rollno);
		

	}

}
