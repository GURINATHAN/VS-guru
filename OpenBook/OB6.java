package Assignment1;

import java.util.Scanner;

public class OB6 {
	private static void divide(Scanner input) {
		System.out.print("Enter the Divident :: "); int divident = input.nextInt();
		System.out.print("Enter the Divisor :: "); int divisor = input.nextInt();
		System.out.println("\t Quotient :: "+  (divident/divisor) +"\t Remainder :: "+ (divident%divisor));
	}

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);	
	divide(input);
	input.close();

	}
}
