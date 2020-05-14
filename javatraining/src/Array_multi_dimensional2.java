
public class Array_multi_dimensional2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			int [][] myArray1 = {
								{12, 13, 23, 45, -34, 2, 3},
								{2, 3, 4, 451, -4, 20, 524},
								{124, 132, 224, 456, -345},
					
								};
			
			int[][] myArray2 = {
								{1, 2, 3, 4, 6, 7, 8, 45},
								{21, 34, 45, 56, 67, 89, 89},
								{14, 32, 45, 67, -21 ,76, 89},
			};
			
			int[][] sumArray = new int[myArray1.length][myArray1[0].length];
			
		//	System.out.println("Array length:" + myArray.length);
			
			for(int i =0; i < myArray1.length; i++) {
				for(int j = 0; j < myArray1[i].length;j++) {
					sumArray[i][j] = myArray1[i][j] + myArray2[i][j];
				}
			}
	
			for(int i = 0; i < sumArray.length;i++) {
				for(int j = 0; j <sumArray[i].length; j++) {
					System.out.print(sumArray[i][j] + "\t");
					
							
				}
				System.out.println();
		
		
}
	}

}