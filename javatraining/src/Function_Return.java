
public class Function_Return {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a =add();
		int b =substract();
		System.out.println(a);
		System.out.println(b);
		
		
	}
		 static int add() {
			
			 int a = 10 , b = 20;
			  int c = a +b;
			  return c;
	 }

		 static int substract() {
			 int a = 10 ,b = 20;
			 int c = a - b;
			 return c;
}
		}