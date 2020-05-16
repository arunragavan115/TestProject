package Exception_Handling;

public class SingleTryCatchExample {

	public static void main(String[] args) {

		try {
			int number1 = 0;
			int number2 = 3;
			int result = number2/number1;
			System.out.println(result);
		}
		catch(ArithmeticException e) {
			System.out.println("dnt divide a number by zero");
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("drink a juice and dnt divide a number by zero");
		}


	}

}
