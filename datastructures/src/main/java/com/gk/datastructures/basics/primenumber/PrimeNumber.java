package com.gk.datastructures.basics.primenumber;

/**
 * @author gangadhar.kasturi
 */

import java.util.Scanner;

/**
 * a number is called prime if it is divisible by iteself and 1 but not by any other number
 */
public class PrimeNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        boolean isPrime = isPrime(number);
        if (isPrime) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Non Prime Number");
        }
        sc.close();
    }

    static boolean isPrime(int number) {

        int count = 2; //starting count from 2 because every number is divisible by 1 and itself
        while (count < number) { //need to check from number 2 to till that inputed number if it is divisible or not..
            if (number % count == 0) { //if it is divisible means it is non prime.. eg. n=7, so need to check if 7 is divisible by 2,3,4,5,6
                return false;
            }
            count++;
        }
        return true;
    }
}
