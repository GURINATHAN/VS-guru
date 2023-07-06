package Assignment1;

import java.util.Scanner;

public class OB16 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Any Option :: \n 1 --> Add \n 2 --> Multiply ");
		int option = input.nextInt();
		
		switch(option) {
		case 1 : OB1.Add(input); break;
		case 2 : OB3.multiply(input); break;
		default : System.err.print("INVALID CHOICE");
		}	
		input.close();
	}
}