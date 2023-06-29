package curs14;

import java.util.Arrays;

public class TwoDimensionArray {

	public static void main(String[] args) {
		
		//int[] array = {1, 2, 3, 4};
		//array[2] //--> este numarul 3 // = 3; index based

		int[][] array = {{1,2}, {3,4}};
		
		//int[2][4]
		/*
		 *           col 0     col 1
		 *  row 0      1         2
		 *  row 1      3         4
		 *  
		 * 
		 */
		
		//System.out.println(array[0][1]);
		
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j<2; j++) {
				System.out.println(array[i][j] + " ");
			}
		}
		
		System.out.println(array.length);
		System.out.println("------------FOR EACH------------------");
		
		//int[][] array = {{1,2}, {3,4}};
		for(int[] row : array) {
			System.out.println("Row :" + Arrays.toString(row));
			for(int col : row) {
				System.out.println("Col :" + col);
			}
		}
		
		
		//Object[][] ---> string row, int column sau boolean;
		// T[][] 
		// Object[][] array = {{"String", true}, {22.0, "altString"}};
		
		
		System.out.println("------------------------------");
		String[][] textArray = new String[2][4];
		
	//String[][] textArray = {{null, null, null, null} , {null, null, null, null}}
	//  prima dimensiune index         0                        1
	// a 2-a dimensiune index    0    1     2    3           0    1    2     3
		textArray[0][0] = "rosu"; 
		//String[][] textArray = {{rosu, null, null, null} , {null, null, null, null}}
		textArray[1][3] = "alb";
		//String[][] textArray = {{rosu, null, null, null} , {null, null, null, alb}}
	//  prima dimensiune index         0                        1
		// a 2-a dimensiune index    0    1     2    3           0    1    2     3
		
		System.out.println(textArray.length);
		System.out.println(textArray[0].length);
		
		for(String[] row : textArray) {
			System.out.println(Arrays.toString(row));
			for(String element : row) {
				System.out.println(element);
			}
		}
		
		
	}

}
