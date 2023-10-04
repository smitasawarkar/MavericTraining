package com.maveric.practice;

public class SalaryCalculatorImpls implements SalaryCalculator {

	public static void main(String[] args) {
		
		//simple way to calculate
		double calratework = hourlyRate*hoursWorked;
		 System.out.println("Calculate hourly salary : "+calratework); 
		 
		 //using lambda expression
		 SalaryCalculator calSalary = (hourlyRate,hoursWorked)-> hourlyRate*hoursWorked;
		
		 double hourlyRate = 10.0;
		 double hoursWorked =40.0;
		 
		 double weeklySalaryCal = calSalary.calculateSalary(hourlyRate, hoursWorked);
		 System.out.println("Calculate weekly salary with lambda expression  : "+weeklySalaryCal); 
		 
		
	}
	

	@Override
	public double calculateSalary(double hourlyRate, double hoursWorked) {
		// TODO Auto-generated method stub
		return 0;
	}

}
