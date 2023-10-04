package com.training.org;


public class Room {
	private double length;
	private double width;
	private double height;
	private String roomName;

	public Room() {
		System.out.println("Default constructor of Room is called");
		length=0;
		width=0;
		height=0;
		roomName="";
	}

	public Room(double length,double width,double height,String roomName) {
		System.out.println("Parameterised constructor of Room is called");
		this.length=length;
		this.width=width;
		this.height=height;
		this.roomName=roomName;
	}

	public String toString() {
		return "\n Room details are "+this.roomName+" "+this.length+" "+this.width+" "+this.height;
	}
}
