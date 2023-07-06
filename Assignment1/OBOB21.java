package Assignment1;

import java.util.Arrays;
import java.util.Scanner;

public class OBOB21 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the size of an ARRAY :: "); int size = input.nextInt();
		int[] arr = new int[size];
		for(int i=0; i<size; i++) {
			System.out.print("Enter a number to Add " +i+" index value :: ");
			arr[i] = input.nextInt();
		}
		System.out.println("Added Array Elements are :: " +Arrays.toString(arr));
		int sum = 0;
		for(int num : arr) {
			sum+=num;
		}
		System.out.println("Sum Of Array Elements --> " +sum);
		input.close();
	}

}
