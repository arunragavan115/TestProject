import java.util.Arrays;

public class ManualSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = { 1, 4, 2, 3, 5 };
		
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if(array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		
		}
		// arrays.sort(array);
		
		for(int i =0; i < array.length; i++) {
			System.out.println(array[i]);
		}
//		for (int i : array) {
//			System.out.println(i);
//		}
	}

}
