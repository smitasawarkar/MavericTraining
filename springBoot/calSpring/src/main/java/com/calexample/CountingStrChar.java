package com.calexample;
import java.util.HashMap;
	import java.util.Map;

	public class CountingStrChar {
	    public static Map<Character, Integer> countCharacters(String str) {
	        Map<Character, Integer> charCountMap = new HashMap<>();

	        for (char c : str.toCharArray()) {
	            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
	        }

	        return charCountMap;
	    }

	    public static void main(String[] args) {
	        String str = "aba";
	        Map<Character, Integer> charCountMap = countCharacters(str);
	        System.out.println(charCountMap);
	    }
	}


