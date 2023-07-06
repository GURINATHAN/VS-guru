package Assignment1;

import java.util.Scanner;

public class OB19 {
	static void reverse(Scanner input) {
		System.out.print("Enter the Number that you want to REVERSE :: "); int num = input.nextInt();
		int rev = 0;
		while(num>0) {
			int last = num % 10;
			rev = (rev * 10) + last;
			num/=10;
		}
		System.out.println("REVERSE of given number --> "+rev);
	}
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	reverse(input);
	input.close();
	}
}
