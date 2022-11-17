package com.Bridgelabz;
//Enter three numbers and do the following arithmetic Operations find max and min.
//        i) a+b*c      ii) c+a/b
//        iii) a%b+c    iV) a*b+c

import java.util.Scanner;

public class ArithmaticMaXMin {

    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter 3 number to do arithmetic operations: ");
        int a = s1.nextInt();
        int b = s1.nextInt();
        int c = s1.nextInt();

        int Ar0 = a + b * c;
        System.out.println("Ar0 is: " + Ar0);
        int Ar1 = c + a / b;
        System.out.println("Ar1 is: " + Ar1);
        int Ar2 = a % b + c;
        System.out.println("Ar2 is: " + Ar2);
        int Ar3 = a * b + c;
        System.out.println("Ar3 is: " + Ar3);

        if ((Ar0 > Ar1) && (Ar0 > Ar2) && (Ar0 > Ar3)) {
            System.out.println("Ar0 is a Maximun" + Ar0);
        } else if ((Ar1 > Ar0) && (Ar1 > Ar2) && (Ar1 > Ar3)) {
            System.out.println("Ar1 is a Maximun" + Ar1);
        } else if ((Ar2 > Ar0) && (Ar2 > Ar1) && (Ar2 > Ar3)) {
            System.out.println("Ar2 is a Maximun" + Ar2);
        } else {
            System.out.println("Ar3 is a Maximun" + Ar3);
        }

        if ((Ar0 < Ar1) && (Ar0 < Ar2) && (Ar0 < Ar3)) {
            System.out.println("Ar0 is a Minimum" + Ar0);
        } else if ((Ar1 < Ar0) && (Ar1 < Ar2) && (Ar1 < Ar3)) {
            System.out.println("Ar1 is a Minimum" + Ar1);
        } else if ((Ar2 < Ar0) && (Ar2 < Ar1) && (Ar2 < Ar3)) {
            System.out.println("Ar2 is a Minimum" + Ar2);
        } else {
            System.out.println("Ar3 is a Minimum" + Ar3);
        }
    }
}
