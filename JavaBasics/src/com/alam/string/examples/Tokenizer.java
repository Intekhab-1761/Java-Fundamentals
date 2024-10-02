package com.alam.string.examples;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tokenizer {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String[] tokens = tokenize(s);
        System.out.println(tokens.length);
        for(String token: tokens) {
        	System.out.println(token);;
        }
        scan.close();
	}

	private static String[] tokenize(String s) {
		Pattern pattern = Pattern.compile("[A-Za-z]+");
		Matcher matcher = pattern.matcher(s);
		
		StringBuilder stringBuilder = new StringBuilder();
		
		while(matcher.find()) {
			stringBuilder.append(matcher.group()).append("\n");			
		}
		return stringBuilder.toString().trim().split("\n");
	}

}
