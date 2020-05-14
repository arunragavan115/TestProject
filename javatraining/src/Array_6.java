import java.util.Scanner;

public class Array_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			int [] myArray = {'a', 'w', 's','t','7', '$','z','s','3'};
			
			char ch = '9';
			
			
			
			
			
			
			for(int i =0; i < myArray.length; i++) {
				if(ch== myArray[i]) {
				
					System.out.println("element" + ch + "is found at " + i);
					break;
			}	
				else if (i == myArray.length-1) {
					System.out.println("element" + ch +  "is not found in the array");
				}
			
		
			}	
			
	}

}