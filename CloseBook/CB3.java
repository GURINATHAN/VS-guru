package Assignment2;

public class CB3 {

	private static void implicit() {
		System.out.println("\t IMPLICIT TYPE CASTING \n byte < short < int < long < float < double");
		byte b = 10; System.out.println("Value of byte = " +b);
		short s = b; System.out.println("Value of byte into short = " +s);
		int i = b; System.out.println("Value of byte into int = " +i);
		long l = b; System.out.println("Value of byte into long = " +l);
		float f = b; System.out.println("Value of byte into float = " +f);
		double d = b; System.out.println("Value of byte into double = " +d +"\n-------------");
		
	}

	private static void explicit() {
		System.out.println("\t EXPLICIT TYPE CASTING \n byte > short > int > long > float > double");
		double d = 3.1472983298d; System.out.println("Value of double = " +d);
		float f = (float) d; System.out.println("Value of double into float = " +f);
		long l = (long) d; System.out.println("Value of double into long = " +l);
		int i = (int) d; System.out.println("Value of double into int = " +i);
		short s = (short) d; System.out.println("Value of double into short = " +s);
		byte b = (byte) d; System.out.println("Value of double into byte = " +b);
	}

	public static void main(String[] args) {
		implicit();
		explicit();
	}

	
}
