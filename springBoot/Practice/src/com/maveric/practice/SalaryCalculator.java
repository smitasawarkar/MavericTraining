package com.maveric.practice;

@FunctionalInterface
public interface SalaryCalculator {

	double hourlyRate = 10.0;
	double hoursWorked = 40.0;

	double calculateSalary(double hourlyRate, double hoursWorked);
	
 
	
}


