package com.Bridgelabz;
//a Program to reverse the integer number using for loop

import java.util.Scanner;

public class ReverseNumFor {
    public static void main(String[] args){
        Scanner s1= new Scanner(System.in);
        System.out.println("Enter any number to reverse: ");
        int num = s1.nextInt();

        int rem = 0;
        int rev = 0;
        for(;num !=0; num=num/10){
            rem = num % 10;
            rev = rev * 10 + rem;
        }
        System.out.println("The reverse number of " + num + " is: " + rev);
    }
}
