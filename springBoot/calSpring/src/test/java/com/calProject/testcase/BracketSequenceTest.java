package com.calProject.testcase;
import org.junit.Test;

import com.calexample.BracketSequence;

import static org.junit.Assert.assertEquals;

public class BracketSequenceTest {
    @Test
    public void testCheckBracketSequence() {
        // Test case 1
        String result1 = BracketSequence.checkBracketSequence("(a+[b*c]-{d/3})");
        assertEquals("1", result1);

        // Test case 2
        String result2 = BracketSequence.checkBracketSequence("(a + [b * c) - 17]");
        assertEquals("0", result2);

        // Test case 3
        String result3 = BracketSequence.checkBracketSequence("(((a * x) + [b] * y) + c");
        assertEquals("0", result3);

        // Test case 4
        String result4 = BracketSequence.checkBracketSequence("auf(zlo)men [gy<psy>] four{s}");
        assertEquals("1", result4);
    }
}
