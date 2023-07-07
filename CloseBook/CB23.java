package Assignment2;

//First of all, there is no main() for execution
//outer class can have either public or default access modifier
//file name should be same as public class name, there is no possible to have more than one public class in a file.
protected class CB23 { 
	String Method() {
		return "Wow";
	}
}

class dervied {
	public void useD() {
		CB23 z = new CB23();
		System.out.println("base says, " + z.Method());
	}
}
