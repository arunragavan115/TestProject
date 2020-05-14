
public class ExceptionDemo2 {

	public static void main(String[] args) {

		System.out.println("Start");
		try {
			System.out.println(10/2);
			System.out.println("try block");

		}catch (Exception e) {
			System.out.println("catch block ");
		} finally {
			System.out.println("finally block");
		}
		System.out.println("end");

	}


}
