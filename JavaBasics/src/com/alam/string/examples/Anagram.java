package com.alam.string.examples;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();
		boolean ret = isAnagram(a, b);
		System.out.println((ret) ? "Anagrams" : "Not Anagrams");
	}

	private static boolean isAnagram(String firstWord, String secondWord) {
		Map<Character, Integer> firstWordFrequency = new HashMap<>();
		Map<Character, Integer> secondWordFrequency = new HashMap<>();

		
		if(firstWord.length() != secondWord.length()) return false;
		
		for (Character ch : firstWord.toCharArray()) {

			firstWordFrequency.put(Character.toLowerCase(ch), firstWordFrequency.getOrDefault(ch, 0) + 1);
		}
		for (Character ch : secondWord.toCharArray()) {

			secondWordFrequency.put(Character.toLowerCase(ch), secondWordFrequency.getOrDefault(ch, 0) + 1);
		}
		
				
		for(Map.Entry<Character,Integer> firstMap: firstWordFrequency.entrySet()) {
			if(secondWordFrequency.containsKey(firstMap.getKey())) {
				Boolean isEqual =(secondWordFrequency.get(firstMap.getKey()) == firstMap.getValue());
				if(isEqual) {
					continue;
				}else {
				return false;
				}
			}else {
				return false;
			}
		}
		return true;
	}

}
