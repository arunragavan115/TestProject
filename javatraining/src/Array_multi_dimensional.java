
public class Array_multi_dimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			int [][] myArray = {
								{12, 13, 23, 45, -34, 2, 3, 54, 7,},
								{2, 3, 4, 451, -4, 20, 524, 79, 10},
								{124, 132, 224, 456, -345, 121, 31, 37, 20},
					
											
			};
			
			System.out.println("Array length:" + myArray.length);
			
			for(int i =0; i < myArray.length; i++) {
				for(int j = 0; j < myArray[i].length;j++) {
					System.out.print(myArray[i][j] + "\t");
		
				}
				System.out.println();
		
		
}
	}

}