package com.gk.datastructures.basics.arrays;

public class MaxFromArray {
    public static void main(String[] args) {
        int arr[] = {1, 34, 23, 34, 345, 67, 657, 678};
        int max = arr[0]; //assuming
        for (int i = 1; i < arr.length; i++) { //start from 1 as we already assumed 0th element as max
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("Maximum number is : " + max
        );
    }
}
