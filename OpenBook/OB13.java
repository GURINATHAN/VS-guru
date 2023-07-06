package Assignment1;

import java.util.Scanner;

public class OB13 {
	private static void floydTriangle(int num) {
		System.out.println("Floyd Triangle \n");
		int k=1;
		for(int i=1; i<=num; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(k++ +" ");
			}
			System.out.println();
		}
		System.out.println("----------------");
	}

	private static void reversePyramid(int num) {
		System.out.println("Reverse Pyramid \n");
		for(int i=1; i<=num; i++) {
			for(int j=num; j>=i; j--) {
				System.out.print("* ");
			}
			for(int l=1; l<=i; l++) {
				System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println("----------------");
	}

	private static void pyramid(int num) {
		System.out.println("Pyramid \n");
		for(int i=1; i<=num; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();	
		}
		System.out.println("----------------");
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the height of PYRAMID :: "); int num = input.nextInt();
		
		pyramid(num);
		reversePyramid(num);
		floydTriangle(num);
		input.close();
	}
}