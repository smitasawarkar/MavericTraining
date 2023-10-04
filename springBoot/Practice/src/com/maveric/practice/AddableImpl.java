package com.maveric.practice;

public class AddableImpl implements Addable  {
		
	public static void main(String[] args) {  
	         
		        // Multiple parameters in lambda expression  
		        Addable ad1=(a,b)->(a+b);  
		        System.out.println(ad1.add(10,20));  
		          
		       
		        // Multiple parameters with data type in lambda expression  
		       // Addable ad2=(int a,int b)->(a+b);  
		       // System.out.println(ad2.add(100,200));  
		    }

	@Override
	public int add(int i, int j) {
		// TODO Auto-generated method stub
		return 0;
	}  

}
