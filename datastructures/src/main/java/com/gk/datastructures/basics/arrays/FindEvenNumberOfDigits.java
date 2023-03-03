package com.gk.datastructures.basics.arrays;

/**
 * Given an array "nums" of integers, return how many contains even number of digits
 */
public class FindEvenNumberOfDigits {

    public static void main(String[] args) {
        int arr[] = {12, 345, 2, 6, 7896};
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            int number = arr[i];
            while (number != 0) {
                number = number / 10;
                count++;
            }
            if (count % 2 == 0) {
                System.out.println(arr[i]);
            }

        }
    }
}
