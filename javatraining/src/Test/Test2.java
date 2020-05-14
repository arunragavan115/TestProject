package Test;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			// Write a Java program to calculate the average value of array elements
		
		int[] numbers = new int[] {12 ,23, 34, 56 };
		int sum = 0;
		int average;
		
		for (int i = 0; i < numbers.length; i++) {
		
		sum = sum + numbers[i];
		}
		
		average = sum/numbers.length;
		
		
		System.out.println(sum);
		System.out.println(average);
		
	

}
}
