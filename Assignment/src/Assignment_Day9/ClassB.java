package Assignment_Day9;

public class ClassB extends ClassAFinal {
	//--There are 2 properties of Final Class
	//We cannot inherit ClassA because that is a final class.
	//We cannot override methods of ClassAFinal if method is Final
	public final void m1() {
		System.out.println("Class A Method");
	}

	public static void main(String[] args) {
		

	}

}
