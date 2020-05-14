package ClassesObjects;

public class StudentProj4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		Student s2 = new Student();
		
		Teacher t1 = new Teacher();
		Teacher t2 = new Teacher();
		
		s1.name = "ragavan";
		s1.rollNum = 12345;
		s2.name= "arun";
		s2.rollNum =  54321;
		
		System.out.println(s1.name);
		System.out.println(s1.rollNum);
		System.out.println("----");
		System.out.println(s2.name);
		System.out.println(s2.rollNum);
		System.out.println("======");
		
		
		t1.name="ravi";
		t1.subject = "maths";
		
		t2.subject = "english";
		t2.name = "kumar";
		
		System.out.println(t1.name);
		System.out.println(t1.subject);
		System.out.println("----");
		System.out.println(t2.name);
		System.out.println(t2.subject);
		
		
		
	}

}
	
	