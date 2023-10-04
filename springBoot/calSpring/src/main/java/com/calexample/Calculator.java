package com.calexample;

import java.util.Scanner;



public class Calculator {

//	 Scanner sc = new Scanner(System.in); 
//		
//	 int a=	sc.nextInt();
//	int b=sc.nextInt();

	public int add(int a,int b)
	{
		
		int c=a+b;
		System.out.println("adding two num :: "+c);
		return c;
	}
	public int sub(int a,int b)
	{
		
		int sub=a-b;
		System.out.println("substracting two num :: "+sub);
		return sub;
	}
	
	public int multiplicaion(int a,int b)
	{
		
		int mul=a*b;
		System.out.println("multiplicaion two num :: "+mul);
		return mul;
	}
	
	public int div(int a, int b)
	{
		try
		{
			int div=a/b;
			System.out.println("div two num :: "+div);
			return div;
		}
		catch(Exception e)
		{
			System.out.println("Exception occure.............! "+e);
			return 0;
		}
		
	}
	
	
	public static void main(String args[])
	{
	
		Calculator cal= new Calculator();
		
		cal.add(5,5);
		cal.sub(5,5);
		cal.multiplicaion(10, 5);
		cal.div(25, 5);
		

	}
}
