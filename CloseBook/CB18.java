package Assignment2;

public class CB18 {
	static final float PI = 3.14f;
	int num=0;
	void PI() {
		System.out.println("Value of PI :: " +PI); //static member can be accessed from static and non-static method.
	}
	
//	CB18(int num) { //since we aren't having no param constructor, we can't create object without parameter.
//		this.num = num;
//	}


	public static void main(String[] args) {
		//PI = 3; SINCE IT IS A FINAL VARIABLE WE CAN'T REASSIGN IT!
		CB18 cb = new CB18();
		cb.PI();
	}
	
}
