package Assignment2;
import java.util.Arrays;
import java.util.Scanner;

public class CB9 {
	
	static void reverse(int[] arr) {
		for(int i=0; i<arr.length/2; i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i] = temp;
		}
		System.out.println("--> Reversed Array  :: " +Arrays.toString(arr));
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of Elements :: "); int size = input.nextInt();
		int[] arr = new int[size];
		for(int i=0; i<size; i++) {
			System.out.print("Enter the "+(i+1) +" number :: ");
			arr[i] = input.nextInt();
		}
		System.out.println("Given Numbers Are  :: " +Arrays.toString(arr));
		reverse(arr);
		input.close();
	}

}
