package com.calProject.testcase;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.calexample.Jumper;

class JumperTestCase {

	   @Test
	    public void testMinimumJumps() {
	        // Test case 1
	        int[] heights1 = {3, 1, 5, 1, 4, 3};
	        int maxJump1 = 2;
	        int result1 = Jumper.minJumps(heights1, maxJump1);
	        assertEquals(3, result1);

	        // Test case 2
	        int[] heights2 = {6,2};
	        int maxJump2 = 3;
	        int result2 = Jumper.minJumps(heights2, maxJump2);
	        assertEquals(-1, result2);
//
//	        // Test case 3
//	        int[] heights3 = {1, 2, 1, 1, 1, 1};
//	        int maxJump3 = 2;
//	        int result3 = Jumper.minJumps(heights3, maxJump3);
//	        assertEquals(4, result3);
//
//	        // Test case 4
//	        int[] heights4 = {1, 5, 3, 6, 2, 7, 8};
//	        int maxJump4 = 4;
//	        int result4 = Jumper.minJumps(heights4, maxJump4);
//	        assertEquals(3, result4);

	    }
	}








