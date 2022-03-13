package Assignment_Day9;

import java.util.Scanner;

public class ConditionOutsideLoop {

	public static void main(String[] args) {
		System.out.println("Enter any number");
		Scanner s=new Scanner(System.in);
		int max=s.nextInt();
		if(max<=10) {
			for(int i=0;i<=max;i++) {
				System.out.println(i);
			}
		}
		

	}

}
