package com.calProject.testcase;
import org.junit.jupiter.api.Test;

import com.calexample.CountingStrChar;
import com.maveric.java_assesment.programs.CharacterCounter;

import java.util.HashMap;

import java.util.Map;

import static org.junit.Assert.assertEquals;

 

public class CharacterCounterTest {

 

      @Test

      public void testCountCharactersWithNonEmptyString() {

            String input = "aba";

            Map<Character, Integer> expected = new HashMap<>();

            expected.put('a', 2);

            expected.put('b', 1);

            assertEquals(expected, CountingStrChar.countCharacters(input));

      }

}
	

