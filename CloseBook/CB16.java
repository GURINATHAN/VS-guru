package Assignment2;

import java.util.Scanner;

public class CB16 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Number to check ..... !! :: "); int num = input.nextInt();
		armStrong(num);
		palindrome(num);
		perfect(num);
		input.close();
	}

	static void perfect(int num) {
		int temp=num, sum=0;
		for(int i=1; i<num; i++) {
			if(num%i==0) 
				sum+=i;
		}
		if(sum==temp)
			System.out.println(sum+ " is PERFECT \n ----------------");
	}

	static void palindrome(int num) {
		int rev = 0, temp=num;
		while(num>0) {
			int last = num % 10;
			rev = (rev * 10) + last;
			num/=10;
		}
		if(temp==rev)
			System.out.println(rev + " is PALINDROME \n -------------------");
	}

	static void armStrong(int num) {
		int x = num, temp=num, sum=0, count=0;
		while(x>0) {
			count++;
			x=x/10;
		}
		int last = num%10, res=1;
		for(int i=0; i<count; i++) {
			res*=last;
		}
		sum=sum+res;
		if(sum==temp) 
			System.out.println(sum+ " is ARMSTRONG \n --------------------");
	}

}
