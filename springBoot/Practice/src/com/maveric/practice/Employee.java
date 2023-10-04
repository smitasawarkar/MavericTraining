package com.maveric.practice;

public class Employee {

	private String name;
	private double hourlyRate;
	private int hoursWorked;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHourlyRate() {
		return hourlyRate;
	}
	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
	public int getHoursWorked() {
		return hoursWorked;
	}
	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	
	public Employee(String name, double hourlyRate, int hoursWorked) {
		super();
		this.name = name;
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
