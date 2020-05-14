import java.util.Arrays;

public class EasySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = { 1, 4, 2, 3, 5 };
		Arrays.sort(array);

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		for (int i : array) {
			System.out.println(i);
			
		}
	}

}
