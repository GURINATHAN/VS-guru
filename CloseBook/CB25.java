package Assignment2;

public class CB25 {
	static double f, s, t;
	static void firstYear(double principle) {
		f = (14000 * 40)/100;
		System.out.println("First Year Profit  :: " +f);
	}

	static void secondYear(double principle) {
		s = (f + principle) - 1500;
		System.out.println("Second Year Amount :: " +s);
	}

	static void thirdYear(double principle) {
		t = (s  * 40)/100;
		System.out.println("Third Year Profit  :: " +t);
	}

	public static void main(String[] args) {
		double principle = 14000;
		firstYear(principle);
		secondYear(principle);
		thirdYear(principle);
	}

}
 