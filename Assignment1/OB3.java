package Assignment1;

import java.util.Scanner;

public class OB3 {
	public static void multiply(Scanner input) {
		System.out.print("Enter the 1st number that you want to multiply :: "); int n1 = input.nextInt();
		System.out.print("Enter the 2nd number that you want to multiply :: "); int n2 = input.nextInt();
		System.out.println("Product of "+n1+" * "+n2 +" :: " +n1*n2);	
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		multiply(input);
		input.close();
	}
}
