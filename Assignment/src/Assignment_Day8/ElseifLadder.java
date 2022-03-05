package Assignment_Day8;

import java.util.Scanner;

public class ElseifLadder {
	
	// && means both the condition must be true 

	public static void main(String[] args) {
		System.out.println("Enter the value");
		Scanner s=new Scanner(System.in);
		int marks=s.nextInt();
		if((marks>=0 && marks<35)) {
			System.out.println("Fail");
		}
		else if((marks>=35 && marks<60)) {
			System.out.println("Pass");
		}
		else if((marks>=60 && marks<=80)) {
			System.out.println("First Division");
		}
		else if((marks>=80 && marks<=100)) {
			System.out.println("Merit");
		}
		else {
			System.out.println("Please enter correct number");
		}
		

	}

}
