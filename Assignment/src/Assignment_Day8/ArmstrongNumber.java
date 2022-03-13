package Assignment_Day8;

import java.util.Scanner;

public class ArmstrongNumber {
	
	//Armstrong number is like 1*1*1 + 5*5*5 + 3*3*3 = 153 Whose sum and cube become same.	 

	public static void main(String[] args) {
		
		System.out.println("Enter any number");
		Scanner s= new Scanner(System.in);
		int rem; int arm=0;
		int n = s.nextInt();
		int c=n;
		while(n>0) {
			rem=n%10;
			arm=(rem*rem*rem)+arm;
			n=n/10;
		}
		if(c==arm) {
			System.out.println("Number is armstrong number");
		}
		else {
			System.out.println("Not a armstrong number");
		}
			
	

	}

}
