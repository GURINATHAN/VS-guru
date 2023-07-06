package Assignment1;

import java.util.Scanner;

public class OB5 {
	static void ascii(Scanner input) {
		System.out.print("Enter the character :: "); char ch = input.next().charAt(0);
		int i = ch;//implicit typecasting happens
		System.out.println("The ASCII value of '"+ch +"' --> "+i);
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ascii(input);
		input.close();
	}

}