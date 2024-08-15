package com.alam.string.examples;

import java.util.Scanner;

public class ExtractSubString {

	  public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        String S = in.next();
	        int start = in.nextInt();
	        int end = in.nextInt();
	        
	        /**Code to extract a sub string from given String**/
	        CharSequence extractedString = S.subSequence(start, end);
	        System.out.println(extractedString);
	        in.close();
	    }
}
