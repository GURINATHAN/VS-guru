package Assignment1;

import java.util.Scanner;

public class OB2 {
	static void display(Scanner input) {
		System.out.print("Enter the Number :: ");int n = input.nextInt();
		System.out.print("The number you entered is --> " + n);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		display(input);
		input.close();
	}

}
