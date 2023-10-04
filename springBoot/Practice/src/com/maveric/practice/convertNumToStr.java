package com.maveric.practice;
import java.util.Scanner;

public class convertNumToStr {
	 
	  public static void main(String[] args) {
	 Scanner in = new Scanner(System.in);
	 System.out.println("Enter a number 1 to 999: ");
	 int n = in.nextInt();

	 	int u = n%10;///unit digit
		int tt=n/10;
		int t=tt%10;///tens digit
		int h=n/100;//// hundred digit
		
		
		 String[] uw = { "", "one", "two", "three", "four", "five", "six", "seven", "eight","nine" };
		 String[] tw = { "", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety" };
		 String[] hw = { "", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen","seventeen", "eighteen", "nineteen" };

	 
	 if(n<0 || n>999)
	 {
		 
		 System.out.println("Invalid Input ......!");
		 
	 }
	 else {
	  if (n < 20) {
		
		  System.out.println(uw[n]);
		
 	        }
	
	 else if (n < 100) {
		 System.out.println(tw[h]+uw[u]);
	
	  }
	 else {
		 
		 System.out.println(tw[h]+uw[u]);
	 }
}
	  }
}