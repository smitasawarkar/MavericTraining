package com.training.org;

import java.util.ArrayList;

import javax.swing.*;

public class ZBuilding {
	
	public static void main(String[] args) {
		Room r1=new Room(12,12,20,"R1");
		Room r2=new Room(12,12,20,"R2");
		Room r3=new Room(12,12,20,"R3");
		Room r4=new Room(12,12,20,"R4");
		
		ArrayList<Room> roomList=new ArrayList<>();
		roomList.add(r1);
		roomList.add(r2);
		roomList.add(r3);
		roomList.add(r4);
		
		Floors first=new Floors("First",roomList);
		
		ArrayList<Floors> floors=new ArrayList<Floors>();
		floors.add(first);
		System.out.println("Enter the name of building ");
		
		String buildingName = JOptionPane.showInputDialog("Enter the name of Building");
		Building rajgad=new Building(buildingName,floors);
		
		System.out.println(rajgad);
				
	}

}
