package Assignment2;
import java.util.Arrays;
import java.util.Scanner;

public class CB6 {
	static void resizableArray(Scanner input) {
		System.out.println("\t ----------Resizable ARRAY----------");
		System.out.print("Enter the number of Elements :: "); int size = input.nextInt();
		int[] arr = new int[size];
		for(int i=0; i<size; i++) {
			System.out.print("Enter the "+(i+1) +" number :: ");
			arr[i] = input.nextInt();
		}
		System.out.println("Given Numbers Are  :: " +Arrays.toString(arr));
	}
	
	static void cantResizableArray(Scanner input) {
		System.out.println("\t ---------- CAN'T Resizable ARRAY----------");
		int[] arr = new int[5];
		System.out.println("\t\t <--Enter Only 5 (five) Numbers --> " );
		for(int i=0; i<arr.length; i++) {
			System.out.print("Enter the "+(i+1) +" number :: ");
			arr[i] = input.nextInt();
		}
		System.out.println("Given Numbers Are  :: " +Arrays.toString(arr));
	}
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	resizableArray(input);
	cantResizableArray(input);
	input.close();
	}
	

}
