package Assignment2;

import java.util.Scanner;

public class CB20 {

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
		System.out.println("The Entered Array Matrix Is --> ");
		for(int row=0; row<rows; row++) {
			for(int col=0; col<cols; col++) {
				
				System.out.print(arr[row][col] +"  ");
			}
			System.out.println();
		}
		System.out.println("Reversed Array Matrix Is -->");
		for(int row=0; row<rows; row++) {
			for(int col=cols-1; col>=0; col--) {
				System.out.print(arr[row][col] +"  ");
			}
			System.out.println();
		}
		input.close();

	}

}
