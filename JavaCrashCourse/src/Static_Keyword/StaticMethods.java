package Static_Keyword;

public class StaticMethods {


	public static void method1() {

		System.out.println("static method"); //but v cannot call static method by non-static method

	}
	public  void nonstatic() {
		method1();		// v can call static method from non-static method
		System.out.println("non static method");
	}

	public static void main(String[] args) {

		/*StaticMethods method = new StaticMethods();
		method.method1();*/    				// if v use static means v can directly call it by below method

		method1();				//if v make member static, v can access it without even creating a object


	}

}
