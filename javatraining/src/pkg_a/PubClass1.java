package pkg_a;

public class PubClass1 {
	
	int a = 10;
	public int b = 20;
	private int c = 30;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		PubClass1 pub1 = new PubClass1(); //can access same class
		Defaut_Class def = new Defaut_Class();
		
//		PubClass2 pub2 = new PubClass2(); // can access public class 
//		Defaut_Class def3 = new Defaut_Class(); //can accesss same class from same package.
		
//		System.out.println(PubClass1.a); //default member can be access by other class
	//	System.out.println(PubClass1.b); //public member can be access
	//	System.out.println(PubClass1.c);//private member can't be access by other class
		
		System.out.println(def.x);// Default class can't be accessed by the other class
		System.out.println(def.y);// public class can't be accessed by other class
		System.out.println(def.z);// private class can't be accessed by other class
//		System.out.println(def.p); //protected class  can't accessed by other class
	}

}
