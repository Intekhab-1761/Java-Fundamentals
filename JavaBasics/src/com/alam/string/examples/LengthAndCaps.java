package com.alam.string.examples;

import java.util.Scanner;

public class LengthAndCaps {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        System.out.println(A.length() + B.length());
        int result = A.compareTo(B);
        if(result > 0) {
        	System.out.println("Yes");
        }else {
        System.out.println("No");
        }
        char firstA = A.toUpperCase().charAt(0);
        char firstB = B.toUpperCase().charAt(0);
        System.out.println(firstA + A.substring(1)+ " " + firstB+ B.substring(1));
        sc.close();
    }
}



