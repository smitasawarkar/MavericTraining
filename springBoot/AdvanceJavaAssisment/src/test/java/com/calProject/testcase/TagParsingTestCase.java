package com.calProject.testcase;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;


import org.junit.jupiter.api.Test;

import com.calexample.TagParsing;

class TagParsingTestCase {


@Test
public void testRetrieveValidContents() {
List<String> lines = new ArrayList<>();
lines.add("<h1>Nayeem loves football</h1>");
lines.add("<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>");
lines.add("<Amee>safat codes like a ninja</amee>");
lines.add("<SA premium>Imtiaz has library</SA premium>");
TagParsing TagParser = null;
List<String> result = TagParser.retrieveValidContents(lines);
assertEquals("Nayeem loves football", result.get(0));
assertEquals("Sanjay has no watch", result.get(1));
assertEquals("So wait for a while", result.get(2));
assertEquals("Imtiaz has library", result.get(3));

}
}
