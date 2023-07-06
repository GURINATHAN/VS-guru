package Assignment1;

import java.util.Scanner;

public class OB4 {
	static void casting(Scanner input) {
		System.out.print("Entet the 1st number to multiply :: "); byte n1 = (byte)input.nextInt();
		System.out.print("Enter the 2nd number to multiply :: "); byte n2 = (byte)input.nextInt();
		byte n3 = (byte) (n1*n2); //explicit typecasting
		System.out.println("Product of "+n1+" * "+n2 +" :: " +n1*n2);
	}
	
	public static void main(String[] args) {
		Scanner input =  new Scanner(System.in);
		casting(input);
		input.close();
	}
}
