package Assignment1;

import java.util.Scanner;

public class OB8 {
	private static void vowel(Scanner input) {
		System.out.print("Enter the character to check whether it is vowel or consonant :: "); char ch = input.next().charAt(0);
		
		if(ch>'a' && ch<'z') {
			if(ch=='a' || ch=='e' ||ch=='i' ||ch=='o' || ch=='u' || ch=='A' || ch=='E' ||ch=='I' ||ch=='O' || ch=='U')
				System.out.println(ch+ " is VOWEL");
			else
				System.out.println(ch+ " is CONSONANT");
		}
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		vowel(input);
		input.close();
	}
}
