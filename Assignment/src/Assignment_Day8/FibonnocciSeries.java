package Assignment_Day8;

import java.util.Scanner;

public class FibonnocciSeries {
	
	//Fibonnocci series is like 0,1,1,2,3,5,8

	public static void main(String[] args) {
		System.out.println("Enter any number");
		Scanner s =new Scanner(System.in);
		int number=s.nextInt();
		int a=0;int b=1; int c;
		for(int i=0;i<=number;i++) {
			System.out.println("Print the value of="+a+" ");
			c=a+b;
			a=b;
			b=c;
			
		}
		
		
		

	}

}
