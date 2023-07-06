package Assignment1;

import java.util.Scanner;

public class OB9 {
	private static void largeNumber(Scanner input) {
		System.out.println("Enter the 3 numbers :: "); int n1 = input.nextInt(); int n2 = input.nextInt(); int n3 = input.nextInt();
		if (n1 > n2 && n1 > n3)
			System.out.println(n1 + " is Largest");
		else if (n2 > n3)
			System.out.println(n2 + " is Largest");
		else
			System.out.println(n3 + " is Largest");
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		largeNumber(input);
		input.close();
	}
}
