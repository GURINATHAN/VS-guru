package Assignment2;

public class CB22 {

	public static void main(String[] args) {
		modifier mod = new modifier();
		//int n1 = mod.n1; #Error
		//mod.privateMethod() #Error
		System.out.print("From Default   :: " +mod.n2 +"--> ");
		mod.defaultMethod();
		System.out.print("From Protected :: " +mod.n3 +"--> ");
		mod.protectedMethod();
		System.out.print("From Public    :: " +mod.n4 +"--> ");
		mod.publicMethod();
	}
}

class modifier {
	private int n1 = 10;
	private void privateMethod() {
		System.out.println("I'm PRIVATE    - \" I can be accessed only within the class\"  ");
	}
	
	int n2 = 20;
	void defaultMethod() {
		System.out.println("I'm DEFAULT   - \" I can be accessed only within the class & within the package \" ");
	}
	
	protected int n3 = 30;
	protected void protectedMethod() {
		System.out.println("I'm PROTECTED - \"I can be accessed only within the class & within the package and also outside the package if Inherited \" ");
	}
	
	public int n4 = 30;
	public void publicMethod() {
		System.out.println("I'm PUBLIC    - \"I can be accessed anywhere\" ");
	}
}
