package com.training.org;

import java.util.ArrayList;

public class Floors {
	
	private String floorNo;
	private ArrayList<Room> rooms;
	
	public Floors() {
		System.out.println("Default constructor of Floors is called");
	}
	
	public Floors(String floorNo, ArrayList<Room> rooms) {
		System.out.println("Parameterised constructor of Floors is called");
		this.floorNo = floorNo;
		this.rooms = rooms;
	}
	
	@Override
	public String toString() {
		return "Floors [\n floorNo=" + floorNo + ", rooms=" + rooms + "]";
	}
}
