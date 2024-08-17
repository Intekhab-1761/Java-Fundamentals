package com.alam.string.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SmallestAndLargest {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        List<String> subStrings = new ArrayList<>();
        int length = s.length();
        for(int i=0;i<=length-k; i++ ) {
        	String result;
        	result = s.substring(i, i+k);
        	subStrings.add(result);        	
        }
        subStrings.sort((o1, o2) -> o1.compareTo(o2));
        smallest = subStrings.get(0);
        largest = subStrings.get(length-k);
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}