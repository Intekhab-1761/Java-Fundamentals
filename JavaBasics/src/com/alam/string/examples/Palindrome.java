package com.alam.string.examples;

import java.util.Scanner;

public class Palindrome {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        String s = scan.next();
        Boolean result = true;
        int l = s.length();
            
        for(int i = 0; i <l/2; i++) {
        	result = (s.charAt(i) != s.charAt(l-1-i))?false:true;   
        	if(result == false) break;
        }
        String palindrome = (result)?"Yes":"No";
        System.out.println(palindrome);
        scan.close();
    }
}
