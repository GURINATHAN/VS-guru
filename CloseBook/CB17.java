package Assignment2;

import java.util.Arrays;
import java.util.Scanner;

public class CB17 {
	static void isPresent(int[] arr, Scanner input) {
		System.out.print("Enter the element to find whether it is present in Array  :: "); int elem = input.nextInt();
		boolean flag = false; 
		int count=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==elem) {
				count++;
				System.out.println("The Entered Element " +elem +" is Present in :: " +i +"index");
				flag = true;
			}
		}
		
		if(flag)
			System.out.println(elem +" present in " +count +" times");
		else
			System.out.println("Entered Element is not present in the Array");
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
		isPresent(arr, input);
		input.close();
	}
}
