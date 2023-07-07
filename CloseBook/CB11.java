package Assignment2;
import java.util.Scanner;

public class CB11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of row    :: "); int rows = input.nextInt();
		int[][] arr = new int[rows][rows+1];
		for(int row=0; row<rows; row++ ) {
			for(int col=0; col<=row; col++) {
				System.out.print("Enter the value of ("+row+","+col+") : " );
				arr[row][col] = input.nextInt();
			}
		}
		for(int row=0; row<rows; row++ ) {
			for(int col=0; col<=row; col++) {
				System.out.print(arr[row][col] +"  ");
			}
			System.out.println();
		}
		input.close();

	}

}
