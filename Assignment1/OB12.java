package Assignment1;

import java.util.Scanner;

public class OB12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number to print :: "); int num = input.nextInt();
		for(int i=1 ; i<=num; i++) {
			for(int j=1; j<=num; j++) {
				System.out.println(i+" , "+j);
			}
			System.out.println();
		}
		input.close();
	}

}
