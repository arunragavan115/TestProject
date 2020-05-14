package Test;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//Write a Java program to create a new String object with the contents of a character array.
			
		 char[] ch = {'a', 'r', 'u', 'n', ' ', 'r', 'a', 'g', 'a', 'v', 'a', 'n'};
	      String str = new String(ch);
	      System.out.println(str);
	      
	      String str2 = String.copyValueOf(ch);
	      System.out.println(str2);
	      
	}

}
