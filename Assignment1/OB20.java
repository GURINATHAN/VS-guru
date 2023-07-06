package Assignment1;

import java.util.Scanner;

public class OB20 {

	static void displayPrime(Scanner input) {
		System.out.print("Enter the limit to print the PRIME number :: " ); int num = input.nextInt();
		for(int i=1; i<num; i++) {
			int count=0;
			for(int j=1; j<=i; j++ ) {
					if (i%j == 0) {
						count++;
						if(count>2)
							break;
					}
				}
				if(count==2)
					System.out.println(i +" is PRIME Number " +"\n --------------------");
			}
		}
		
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		displayPrime(input);
		input.close();
	}


}
