package Null_Concept;

public class Null_concept {
	//null means nothing

	static Object obj;		//default ref value of these 3 is null;
	static String str;
	static Null_concept nc;

	public static void main(String[] args) {

		Object obj=null;		// v should give case sensitive;

		System.out.println(obj);
		System.out.println(str); 
		System.out.println(nc);

		/*Integer i = null;   // wrapper class
		int j = i;*/			//this is not allowed if null value is assigned to primitive datatype 

		//instance of
		Integer i = null;
		Integer j = 10;

		System.out.println(j instanceof Integer);  //true 
		System.out.println(i instanceof Integer);  //false because i value is null v did not give any value for i

		//static vs on-static with respective null
		Null_concept lak=null;
		//	lak.send();
		lak.sum();

		//== and !=
		System.out.println(null == null); //true null can be compiled with null
		System.out.println(null!=null);   //false null not equal to null is false
		
		String str=null;
		Integer i1=null;
		Double d1=null;
		
		String s1=(String) null;
		System.out.println(s1    + "123");
	//	System.out.println(s1.length());  // it will throw null pointer exception because nothing + length is nullpointer exception
		System.out.println(s1.charAt(0));   // any string operation cannot be done after type casting

		
		Integer i2=(Integer) null;		//null can be type casting into integer and double
		Double d2=(Double) null;
	}
	public static void sum() {
		System.out.println("sum....."); //static method can be excess by null references
	}
	public void send() {
		System.out.println("send....");

	}

}

