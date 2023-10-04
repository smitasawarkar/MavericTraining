package com.training.org;

import java.util.ArrayList;

public class Building {
	private String buildingName;
	private ArrayList<Floors> floor_number;
	
	public Building() {
		System.out.println("Default construtor of Building is called");
		buildingName="";
		floor_number=new ArrayList<Floors>();
	}
	
	public Building(String buildingName, ArrayList<Floors> floor_number) {
		System.out.println("Parameterised construtor of Building is called");
		this.buildingName = buildingName;
		this.floor_number = floor_number;
	}

	@Override
	public String toString() {
		return "Building [\n buildingName=" + buildingName + ", floor_number=" + floor_number + "]";
	}
}
