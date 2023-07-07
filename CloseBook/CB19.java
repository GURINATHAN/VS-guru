package Assignment2;

import java.util.Scanner;

public class CB19 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Any Number :: ");
		int num = input.nextInt();
		int temp = num, rev=0;
		while(temp>0) {
			int n = temp%10;
			rev = (rev*10) +n; 
			temp/=10;
		}
		while(rev>0) {
			int n = rev%10;
			if(n==1) 
				System.out.print("ONE ");
			else if(n==2)
				System.out.print("TWO ");
			else if(n==3)
				System.out.print("THREE ");
			else if(n==4)
				System.out.print("FOUR ");
			else if(n==5)
				System.out.print("FIVE ");
			else if(n==6)
				System.out.print("SIX ");
			else if(n==7)
				System.out.print("SEVEN ");
			else if(n==8)
				System.out.print("EIGHT ");
			else if(n==9)
				System.out.print("NINE ");
			else
				System.out.print("ZERO ");
			rev=rev/10;
		}
	
	input.close();
	}

}
