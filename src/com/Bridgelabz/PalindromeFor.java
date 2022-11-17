package com.Bridgelabz;
// a Program to find Palindrome Number using for loop

import java.util.Scanner;

public class PalindromeFor {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter any number to reverse: ");
        int num = s1.nextInt();
        int temp = num;
        int rem = 0;
        int rev = 0;

        for (; num != 0; num = num / 10) {
            rem = num % 10;
            rev = rev * 10 + rem;
        }

        if (temp == rev) {
            System.out.println("The number " + temp + " is a Palindrome");
        } else {
            System.out.println("The number " + temp + " is not a Palindrome");
        }
    }
}
