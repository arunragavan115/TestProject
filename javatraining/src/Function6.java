
public class Function6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] myArray = { 'a' , 'b' ,'c' , 'd' , 'e' , '$' , '3'};
		char ch= 'b';

		if( findElement(myArray,ch))
			System.out.println("Element found in the array ");

		else
			System.out.println("Element is not found in the array");
	}
	static boolean findElement(char[] chArr, char ch) {

		for(int i = 0; i < chArr.length; i++) {
			if(ch == chArr[i]) {
				return true;
			}
		}
		return false;
	}
}
