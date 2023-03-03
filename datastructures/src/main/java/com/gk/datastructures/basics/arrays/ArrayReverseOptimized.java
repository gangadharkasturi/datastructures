package com.gk.datastructures.basics.arrays;

import java.util.Arrays;

/**
 * [1,2,3,4,5]
 * [5,2,3,4,1]
 * [5,4,3,2,1]
 */

public class ArrayReverseOptimized {
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
