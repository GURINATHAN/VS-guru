package Assignment1;

import java.util.Scanner;

public class OB14 {
	private static void sumOfNumbers(Scanner input) {
		System.out.print("Enter any number below 10 :: "); int num = input.nextInt();
		int sum=0, n=num;
		while(num > 0) {
			sum+=num--;
		}
		System.out.println("Sum of 0 to " +n +" :: " +sum);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		sumOfNumbers(input);
		input.close();
	}
}
