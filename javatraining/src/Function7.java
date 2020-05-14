
public class Function7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] myArray = { 'a' , 'b' ,'c' , 'd' , 'e' , '$' , '3'};

		recursivePrint(myArray, 0);
	}
	static void recursivePrint(char[] chArr, int i) {

		if (i <chArr.length) {
			System.out.println(chArr[i++]);
			recursivePrint(chArr, i);
		}
	}

}

