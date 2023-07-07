package Assignment2;

import java.util.Scanner;

public class CB4 {
	
	static void primeNumber(Scanner input) {
		System.out.print("Enter the Number that you want to check whether it is PRIME or COMPOSITE :: "); int num = input.nextInt();
		int count = 0;
		for(int i=1; i<=num; i++) {
			if (num%i == 0) {
				count++;
				if(count>2)
					break;
			}
		}
		if(count==2)
			System.out.println(num +" is PRIME Number " +"\n --------------------");
		else
			System.out.println(num +" is COMPOSITE Number " +"\n --------------------");
	}
	public static void main(String[] args) {
		Scanner input =  new Scanner(System.in);
		primeNumber(input);
		input.close();
	}

}
