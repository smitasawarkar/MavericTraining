package com.training.org;

abstract class InterestRate {

	protected double interestRate;
	abstract void getRate();
	
	public void calculateEMI(double amount,int year) {
		
	

		    int month = year*12;

		    double emi = (amount*interestRate*Math.pow(1 + interestRate, month))/ (Math.pow(1 + interestRate, month) - 1);

		    System.out.println(emi);

		    
	}
	
}
