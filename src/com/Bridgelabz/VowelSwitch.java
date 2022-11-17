package com.Bridgelabz;
//Program to Check Vowel or Consonant using switch

import java.util.Scanner;

public class VowelSwitch {
    public static void main(String[] args){
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter any character: ");
        char ch = s1.next().charAt(0);


        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is vowel");
                break;
            default:
                System.out.println(ch + " is consonant");
        }

    }
}
