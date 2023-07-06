package Assignment1;

import java.util.Scanner;

public class OB17 {

	private static void nestedSwitch(Scanner input) {
		System.out.println("Enter the Package :: \n 1 --> Testing Package  \n 2 --> Development Package");
		int option = input.nextInt();
		switch (option) {
		case 1:
			System.out.println("Enter the choice :: \n 1 --> Manual Testing \n 2 --> Automation Testing");
			int choice1 = input.nextInt();
			switch (choice1) {
			case 1:
				System.out.println("Thanks For Choosing Manual Testing !!!");
				break;
			case 2:
				System.out.println("Thanks For Choosing Automation Testing !!!");
				break;
			default:
				System.err.println("INVALID SELECTION");
			}
			break;
		case 2:
			System.out.println("Enter the choice :: \n 1 --> Java Full Stack \n 2 --> Python Full Stack");
			int choice2 = input.nextInt();
			switch (choice2) {
			case 1:
				System.out.println("Thanks For Choosing Java Full Stack !!!");
				break;
			case 2:
				System.out.println("Thanks For Choosing Python Full Stack !!!");
				break;
			default:
				System.err.println("INVALID SELECTION");
			}
			break;
		default:
			System.err.println("INVALID OPTION");
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		nestedSwitch(input);
		input.close();
	}
}
