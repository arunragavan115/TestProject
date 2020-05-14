package Constructor;

public class Child_Class extends ParentClass {
	
	public  Child_Class() {
		super();				// if v extends the another class means super keyword is comes by default 
		System.out.println("child constructor");
	}

	public static void main(String[] args) {
		
		Child_Class childclass = new Child_Class();
			
	}

}
