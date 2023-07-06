package Assignment1;

import java.util.Scanner;

public class OB1 {
	public static void Add(Scanner input) {
		System.out.print("Enter the 1st numbers that you want to add :: "); int n1 = input.nextInt();
		System.out.print("Enter the 2st numbers that you want to add :: "); int n2 = input.nextInt();
		System.out.println("Product of " + n1 + " + " + n2 + " :: " + (n1 + n2));
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Add(input);
		input.close();
	}

}
