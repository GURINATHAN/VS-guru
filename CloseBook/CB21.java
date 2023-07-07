package Assignment2;

import java.util.Scanner;

public class CB21 {
	static void largestNumber(int[][] arr, int rows, int cols) {
		int max=0;
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				if(arr[i][j]>max)
					max=arr[i][j];
				}
			}
		System.out.println("Largest Number in the given Matrix :: " +max);
		}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of row    :: "); int rows = input.nextInt();
		System.out.print("Enter the number of column :: "); int cols = input.nextInt();
		int[][] arr = new int[rows][cols];
		for(int row=0; row<rows; row++ ) {
			for(int col=0; col<cols; col++) {
				System.out.print("Enter the value of ("+row+","+col+") : " );
				arr[row][col] = input.nextInt();
			}
		}
		largestNumber(arr, rows, cols);
		input.close();
	}
}
