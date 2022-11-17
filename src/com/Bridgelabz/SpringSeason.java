package com.Bridgelabz;
//takes two int values m and d and prints true if day d of month m is between
// March 20 (m = 3, d=20) and June 20 (m = 6, d = 20), false otherwise.

public class SpringSeason {
    public static void main(String[] args){
        System.out.println("Date: "+ args[0]);
        System.out.println("Month: " + args[1]);
        int m = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);


        if (m>=3 && m <= 6 && d <= 20) {
            System.out.println("True");
        }else if ((m>=3 && m <= 6)&& d <= 20) {
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }

}







