package Assignment2;
import java.util.Arrays;
import java.util.Scanner;

public class CB5 {
	static void average(Scanner input) {
		System.out.print("Enter the number of Elements :: "); int size = input.nextInt();
		int[] arr = new int[size];
		for(int i=0; i<size; i++) {
			System.out.print("Enter the "+(i+1) +" number :: ");
			arr[i] = input.nextInt();
		}
		System.out.println("Given Numbers Are  :: " +Arrays.toString(arr));
		int sum = 0;
		for(int num : arr) {
			sum+=num;
		}
		System.out.println("Sum Of Given Numbers    --> " +sum);
		double avg = (sum/size);
		System.out.println("Average of Given Numbers --> " +avg);
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		average(input);
		input.close();
	}

}
