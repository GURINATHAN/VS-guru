package Assignment1;

import java.util.Scanner;

public class OB18 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while(true) {
			System.out.println("Enter the option :: \n 1 --> Rectangle \n 2 --> Square \n 3 --> Triangle \n 4 --> Circle \n 5 --> Prime Number"); 
			int option = input.nextInt();
			switch(option) {
			case 1 : areaOfRectangle(input); break;
			case 2 : areaOfSquare(input); break;
			case 3 : areaOfTriangle(input); break;
			case 4 : areaOfCircle(input); break;
			case 5 : primeNumber(input); break;
			case 6 : System.out.println("Thank you for using me :) "); System.exit(0); break;
			default : System.err.println("INVALID SELECTION !!!"); input.close();
			}
		}
		
	}

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

	static void areaOfCircle(Scanner input) {
		System.out.print("Enter the Radius of the Circle :: "); int radius = input.nextInt();
		double area = Math.PI*(radius*radius);
		System.out.println("Area of Circle --> " +area +"\n --------------------");	
	}

	static void areaOfTriangle(Scanner input) {
		System.out.print("Enter the Height of the Triangle :: "); int height = input.nextInt();
		System.out.print("Enter the Base of the Triangle :: "); int base = input.nextInt();
		System.out.println("Area of Triangle --> "+ ((height*base)/2) +"\n --------------------");
	}

	static void areaOfSquare(Scanner input) {
		System.out.print("Enter the Side of the Square :: "); int side = input.nextInt();
		System.out.println("Area of Square --> " +(side*side) +"\n --------------------");
	}

	static void areaOfRectangle(Scanner input) {
		System.out.print("Enter the Length Of the Rectangle :: "); int length =  input.nextInt();
		System.out.print("Enter the Width Of the Rectangle :: "); int width = input.nextInt();
		System.out.println("Area of Rectangle --> "+(length*width) +"\n --------------------");
	}

}