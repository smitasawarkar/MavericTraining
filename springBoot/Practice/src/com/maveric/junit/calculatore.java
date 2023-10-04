package com.maveric.junit;
import java.util.Scanner;
public class calculatore {
	
	
	
	
	 Scanner sc = new Scanner(System.in); 
	
	 int a=	sc.nextInt();
	int b=sc.nextInt();
	
	void add()
	{
		
		int c=a+b;
		System.err.println("adding two num :: "+c);
	}
	void sub()
	{
		
		int sub=a-b;
		System.err.println("substracting two num :: "+sub);
	}
	
	void multiplicaion()
	{
		
		int mul=a+b;
		System.err.println("multiplicaion two num :: "+mul);
	}
	
	void div()
	{
		
		int div=a/b;
		System.err.println("div two num :: "+div);
	}
	
	public static void main(String args[])
	{
	calculatore cal= new calculatore();
		cal.add();
		cal.sub();
		cal.multiplicaion();
		cal.div();
		
		

	}

}
