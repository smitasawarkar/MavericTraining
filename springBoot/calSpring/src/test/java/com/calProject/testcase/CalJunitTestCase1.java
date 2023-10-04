package com.calProject.testcase;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.calexample.Calculator;

class CalJunitTestCase1 {
	
	@Autowired
	Calculator cal= new Calculator();

	//int i=5;
	//int j=5;
//@Before
//public void setup()
//{
//	
//
//}

	//@Test
//	void test() {
//		fail("Not yet implemented");
//	}
	@Test
	public void addTest()
	{
		int i=5;
		int j= 5;
		int expectedResult =10;
		int result = cal.add(i,j);
		assertEquals(expectedResult, result);
		
	}
	@Test
	public void subTest()
	{
		int i=5;
		int j=5;
		int expectedsubResult =0;
		int result = cal.sub(i,j);
		assertEquals(expectedsubResult, result);
		
	}
	@Test
	public void mulTest()
	{
		int i=10;
		int j= 5;
		int expectedmulResult =50;
		int result = cal.multiplicaion(i,j);
		assertEquals(expectedmulResult, result);
		
	}
	
	@Test
	public void divTest()
	{
		int i=25;
		int j= 0;
		int expecteddivResult =0;
		int result = cal.div(i,j);
		assertEquals(expecteddivResult, result);
		
	}

}
