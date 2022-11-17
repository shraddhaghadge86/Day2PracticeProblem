package com.Bridgelabz;
//Program to reverse the integer number using while

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args){
        Scanner s1= new Scanner(System.in);
        System.out.println("Enter any number to reverse: ");
        int num = s1.nextInt();

        int rem = 0;
        int rev = 0;
        while(num !=0){
            rem = num % 10;
            rev = rev * 10 + rem;
            num= num/10;
        }
    System.out.println("The reverse number of " + num + " is: " + rev);
    }
}
