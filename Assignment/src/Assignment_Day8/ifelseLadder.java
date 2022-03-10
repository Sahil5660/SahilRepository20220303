package Assignment_Day8;

import java.util.Scanner;

public class ifelseLadder {
	
	//Here we are checking for outer if else that number is positive or negative and for inner if else we are checking odd and even values in result

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the value");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		if(a>0) {
			//System.out.println("Number is negative");
		    if(a%2==0) {
				System.out.println("Even Number");
			}
		
		else {
			System.out.println("odd number");
		}
	}
	
		else { 
			System.out.println(" Please enter positive number");
		}
}
	

}
