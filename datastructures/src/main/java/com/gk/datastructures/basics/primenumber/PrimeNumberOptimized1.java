package com.gk.datastructures.basics.primenumber;

import java.util.Scanner;

public class PrimeNumberOptimized1 {

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

    /**
     *
     * @param number
     * @return
     *
     * eg: 36
     * 1*36 = 36
     * 2*18 = 36
     * 3*12 = 36
     * 4*9 = 36
     * 6*6= 36  ==> after this all the factors i.e. divisible are repeated
     * 9*4=36
     * 12*3 = 36
     * 18*2 = 36
     * 36*1 =36
     * so if we observe we need to check till square root of the number
     */

    private static boolean isPrime(int number) {

        int count = 2;
        while (count <= Math.sqrt(number)) { //or while(count*count< =n)
            if (number % count == 0) {
                return false;
            }
            count++;
        }
        return true;
    }


}
