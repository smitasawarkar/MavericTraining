package com.calProject.testcase;



import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.calexample.Persistence;

	public class PersistenceTest {
	    @Test
	    public void testPersistence() {
	        // Test case 1
	        int result1 = Persistence.persistence(39);
	        assertEquals(3, result1);

	        // Test case 2
	        int result2 = Persistence.persistence(999);
	        assertEquals(4, result2);

	        // Test case 3
	        int result3 = Persistence.persistence(4);
	        assertEquals(0, result3);
	    }
	






}
