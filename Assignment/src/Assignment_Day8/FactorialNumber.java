package Assignment_Day8;

import java.util.Scanner;

public class FactorialNumber {
	
	//24=4*3*2*1

	public static void main(String[] args) {
		System.out.println("Enter the value");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i; 
		}
		System.out.println("Print the value of ="+fact);

	}

}
