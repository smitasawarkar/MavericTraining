package com.calProject.testcase;

import org.junit.jupiter.api.Test;

import com.calexample.CountingStrChar;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;

import java.util.Map;

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
