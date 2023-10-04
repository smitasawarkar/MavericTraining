package com.maveric.practice;
import java.util.*;

public class ListWithLambdaEx implements ListInterface{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<String>();  
        list.add("ankit");  
        list.add("mayank");  
        list.add("irfan");  
        list.add("jai");  
          
        list.forEach( (n)->System.out.println(n) );
	}

}
