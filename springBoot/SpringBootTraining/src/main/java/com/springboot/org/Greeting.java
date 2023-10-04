package com.springboot.org;

public class Greeting {
 private int id;
 private String name;
 
 

public Greeting(int id, String name) {
	System.out.println("Parameterise Greeting method");
	this.id = id;
	this.name = name;
}
public Greeting() {
	System.out.println("Defoult Greeting method");
}
 
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "Greeting [id=" + id + ", name=" + name + "]";
}

 
}
