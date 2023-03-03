package com.gk.datastructures.basics.commons;

public class Fibonacci {

    public static void main(String[] args) {
        int numberToPrint = 7; //means print 5th number in series
        int a = 0; //initial value 1
        int b = 1; //initial value 2
        int count = 2; //start from next number
        while(count < numberToPrint){
            int temp = b;
            b = a+b;
            a = temp;
            count++;
        }
        System.out.println(b);
    }
}
