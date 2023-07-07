package Assignment2;
import java.util.Arrays;
import java.util.Scanner;

public class CB8 {

	static void usingIndex(int[] arr, Scanner input) {
		System.out.print("Enter the element to find the index place  :: "); int elem = input.nextInt();
		boolean flag = true;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==elem) {
				System.out.println("The Place of " +elem +" :: " +i);
				flag = false;
			}
		}
		if(flag)
			System.out.println("Entered Element is not present in the Array");
	}

	static void usingElement(int[] arr, Scanner input) {
		System.out.print("Enter the index to find the element  :: "); int index = input.nextInt();
		boolean flag = true;
		for (int i = 0; i < arr.length; i++) {
			if(i==index) {
				System.out.println("The Element of " +index +" index :: " +arr[i] );
				flag = false;
			}
		}
		if(flag)
			System.out.println("Entered index is not present in the Array");
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
		usingElement(arr, input);System.out.println( "-----------------------");
		usingIndex(arr, input);
		input.close();
	}


}
