package Assignment_Day3;

public class Assignment1 {
	
	/*
	 * Three parametrized constructor 
	 * Default constructor 
	 * Two parametrized constructor 
	 * Four Parametrized constructor 
	 * One Parametrized Constructor
	 */
	
	public Assignment1() {
		this(1,2,3);
		System.out.println("Default constructor");
		
	}
	public Assignment1(int a) {
		this(1,2,3,4);
		System.out.println("One Parametrized Constructor");
		
	}
	public Assignment1(int a, int b) {
		this();
		
		System.out.println("Two parametrized constructor");
	}
	
	public Assignment1(int c, int d, int e) {
		System.out.println("Three parametrized constructor");
	}
	public Assignment1(int d, int e, int f, int g) {
		this(1,2);
     System.out.println("Four Parametrized constructor");
}
	
	public static void main(String[] args) {
		Assignment1 obj1=new Assignment1(1);
	}
		
	}
