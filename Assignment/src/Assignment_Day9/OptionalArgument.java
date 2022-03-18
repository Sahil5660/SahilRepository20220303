package Assignment_Day9;

public class OptionalArgument {
	
	//By using optional argument we can call our method by using any of data types as mentioned below 

	public void method1(Object...A) {
		
		System.out.println("Method1");
			
		
	}

	public static void main(String[] args) {
	
    OptionalArgument obj1=new OptionalArgument();
    obj1.method1('A');
    obj1.method1("abc");
    obj1.method1(123);
    obj1.method1(12.3);
	}

}
