package com.Bridgelabz;
//Program for the sum of n natural numbers using for loop

import java.util.Scanner;

public class SumofNaturalFor {
    public static void main(String[] args){

        Scanner s1 = new Scanner(System.in);
        System.out.println("Enetr any number: ");
        int num = s1.nextInt();
        int sum = 0;

        for(int i = 0; i<=num; i++){
           sum = sum + i;
        }

        System.out.println("The sum of " + num + " is: " + sum);
    }

}
