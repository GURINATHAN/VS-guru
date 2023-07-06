package Assignment1;

import java.util.Scanner;

public class OB7 {
	private static void oddOrEven(Scanner input) {
		System.out.print("Enter the number :: "); int num = input.nextInt();
		if(num%2==0) 
			System.out.println(num +" is Even");
		else
			System.out.println(num+ " is Odd");
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		oddOrEven(input);
		input.close();
	}
}
