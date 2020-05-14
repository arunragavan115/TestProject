
public class ExceptionDemo3 {

	public static void main(String[] args) {

		System.out.println("Start");
		try {
			String s = null;
			System.out.println(s.length());
		//	System.out.println(10/2);
			System.out.println("try block");

		}catch (Exception e) {
			System.out.println("catch block ");
		} finally {
			System.out.println("finally block");
		}
		System.out.println("end");

	}


}
