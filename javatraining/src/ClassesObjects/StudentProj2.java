package ClassesObjects;

public class StudentProj2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		Teacher t1 = new Teacher();
		
		
		System.out.println(s1.name);
		System.out.println(s1.rollNum);
		
		System.out.println(t1.name);
		System.out.println(t1.subject);
		
		
	}

}
	
	class Teacher{
		String name;
		String subject;
	}