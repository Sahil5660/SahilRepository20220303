package Assignment_Day8;

public class SwappingNumber2 {
	
	//Swapping of 2 number without using 3rd variable

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;
		int b=10;
		a=a+b; //Value of a become a=15
		b=a-b; //Value of b become b=5
		a=a-b; //Value of a become now a=10
		System.out.println("Value of b is="+b);
		System.out.println("Value of a is="+a);
		

	}

}
