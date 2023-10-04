package com.AbstractFactoryPattern.org;

public abstract class Loan {
	  protected double rate;  
	 	   abstract void getInterestRate(double rate);  
		   public void calculateLoanPayment(double loanamount, int years)  
	 	   {  
	  	        /* 
	  7.	              to calculate the monthly loan payment i.e. EMI   
	  8.	                            
	  9.	              rate=annual interest rate/12*100; 
	  10.	              n=number of monthly installments;            
	  11.	              1year=12 months. 
	  12.	              so, n=years*12; 
	 	 
	 .	            */  
	 	                
		         double EMI;  
	 	         int n;  
	   
	 	         n=years*12;  
	 	         rate=rate/1200;  
	 	         EMI=((rate*Math.pow((1+rate),n))/((Math.pow((1+rate),n))-1))*loanamount;  
	 	  
	  	System.out.println("your monthly EMI is "+ EMI +" for the amount"+loanamount+" you have borrowed");     
	 	 }  
}
