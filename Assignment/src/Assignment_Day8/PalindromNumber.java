package Assignment_Day8;

import java.util.Scanner;

public class PalindromNumber {
	
	//121 : opposite and equal is same 

	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner s1=new Scanner(System.in);
		int n=s1.nextInt();
		int c=n;
		int s=0;
		while(n>0) {
			int r=n%10;
			s=(s*10)+r;
			n=n/10;
		}
       if(c==s) {
    	   
	   System.out.println("Palindrom number");
	   
        }
       else {
    	   
	   System.out.println("Not a palindrom number");
       }
	   }

}
