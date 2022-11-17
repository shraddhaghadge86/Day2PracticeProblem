package com.Bridgelabz;
//a Program for the sum of n natural numbers using while loop

import java.util.Scanner;

public class SumOfNaturalNum {
    public static void main(String[] args){

        Scanner s1 = new Scanner(System.in);
        System.out.println("Enetr any number: ");
        int num = s1.nextInt();
        int i = 0;
        int sum = 0;
        while(i <= num){
            sum = sum + i;
            i++;
        }
        System.out.println("The sum of" + num + "natural number is: " + sum);
    }
}
