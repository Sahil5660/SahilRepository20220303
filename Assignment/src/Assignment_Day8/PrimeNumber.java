package Assignment_Day8;

import java.util.Scanner;

public class PrimeNumber {
	
	//there are 2 way to achieve prime number as below

	public static void main(String[] args) {
		
		System.out.println("Enter any number");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int count=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0){
				
			count++;
		}
		
	}
	if(count==2) {
		System.out.println("Number is a prime number");
	}
	else {
		System.out.println("Number is not a prime number");
	}
}
}
		
    /*    System.out.println("Enter any number");
		Scanner s=new Scanner(System.in);
		int number=s.nextInt();
		int temp=0;
		for(int i=2;i<=number-1;i++) //11
		{
			if(number%i==0) {
				temp=temp+1;
				}
		}
			if(temp>0) {
				
				System.out.println("Number is not a prime number");
			}
				
			else {
				System.out.println("Number is a prime number");
			}
		}

	}*/

	/* int number=7;int temp=0;
	 * 
	 * for(int i=2;i<=number-1;i++) { 
	 * 
	 * if(number%i==0) { 
	 * 
	 * temp=temp+1; 
	 * } 
	 * } 
	 * if(temp>0)
	 * {
	 * 
	 * System.out.println("Number is not a number"); }
	 * 
	 * else { System.out.println("Number is a prime number"); } }
	 * 
	 * }
	 */
		
		