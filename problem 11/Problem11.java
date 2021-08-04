import java.util.Scanner;
import java.io.*;
public class Problem11 {
	
	public static void main(String[] args) {
	
		// create an empty 20x20 grid (2d array)
		int[][] arr = new int[20][20];
		
		// read and process the grid file into a 2d array
        	try {
                	File gridF = new File("grid.txt");
                	Scanner reader = new Scanner(gridF);
			
			// use a nested for loop to put all the numbers into the 20x20 array
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[0].length; j++) {
					arr[i][j] = Integer.valueOf(reader.next());      // converts the string into int and adds to array
				}
			}
                	
               	// gridF.close() seems to be giving an error
	  
        	} catch(FileNotFoundException e) {
                	System.out.println("Error");
        	}


		//**********************************************************************************************88

		
		int highP = 0;           // an int variable that stores the highest product of 4 adjascent numbers
		int temp = 0;            // stores the immediately calculated product and compares it with highP
		int[] fourAdj = new int[4];           // stores the 4 adjacent numbers that have the highest product

		for (int i = 0; i <= 19; i++) {
			for (int j = 0; j <= 19; j++) {
				// check horizontal products
				if (j <= (16)) {
					temp = arr[i][j] * arr[i][j+1] * arr[i][j+2] * arr[i][j+3];
					if (temp > highP) {
						highP = temp;
						temp = 0;
						
					}
				}
				// check vertical products
				if (i <= (16)) {
					temp = arr[i][j] * arr[i+1][j] * arr[i+2][j] * arr[i+3][j];
                                        if (temp > highP) {
                                                highP = temp;
						temp = 0;
                                                
                                        }

				}
				// check "south-east" diagonal products
				
				if ((i <= 16) && (j <= 16)) {
					temp = arr[i][j] * arr[i+1][j+1] * arr[i+2][j+2] * arr[i+3][j+3];
                                        if (temp > highP) {
                                                highP = temp;
						temp = 0;
					}                                        
				
                        	}
				// check "south-west" diagonal products
				if ((i >= 3) && (j <= 16)) {	
                       	                temp = (arr[i][j] * arr[i-1][j+1] * arr[i-2][j+2] * arr[i-3][j+3]);
                                        if (temp > highP) {
                                                highP = temp;
					
                                        }
                                }       
	



			}
		}


		//System.out.println("Greatest Product of 4 adjascent integers: " + (fourAdj[0] * fourAdj[1] * fourAdj[2] * fourAdj[3]) );
		System.out.println(highP);



	
	}








}
