package Assignment1;

import java.util.Scanner;

public class OB10 {

	private static void swap(Scanner input) {
		System.out.println("Enter the 2 Numbers to swap :: "); float f1 = input.nextFloat(); float f2 = input.nextFloat();
		System.out.println("\t BEFORE SWAPPING [ " +f1+" , "+ f2+" ]");
		float temp = f1;
		f1 = f2;
		f2 =  temp;
		System.out.println("\t AFTER SWAPPING [ " +f1+" , "+ f2+" ]");
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		swap(input);
		input.close();
	}
}
