package com.Bridgelabz;
//Program to Read a Number 1,10,100,1000 and display unit, ten hundred

import java.util.Scanner;

public class DisplayUnit {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter any number between 0 to 9999: ");
        int num = s1.nextInt();

        int thousand = 0;
        int hundred = 0;
        int ten = 0;
        int one = 0;

        if (num >= 1000 && num <= 9999) {
            thousand = num / 1000;
            hundred = (num % 1000) / 100;
            ten = ((num % 1000) % 100) /10;
            one = ((num % 1000) % 100) % 10;
            System.out.println("thousands place digit: " + thousand);

        } else if (num >= 100 && num <= 999) {
            hundred = num / 100;
            ten = (num % 100) / 10;
            one = (num % 100) % 10;
            System.out.println("hundred place digit: " + hundred);
            System.out.println("ten place digit: " + ten);

        }else if (num >= 10 && num <= 99) {
            ten = num / 10;
            one = num % 10;
            System.out.println("ten place digit: " + ten);
        }else{
            one =num;
        }

        System.out.println("unit place digit: " + one);
    }

}
