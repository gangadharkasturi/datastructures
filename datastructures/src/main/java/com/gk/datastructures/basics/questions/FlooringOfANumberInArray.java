package com.gk.datastructures.basics.questions;

import java.util.Scanner;

public class FlooringOfANumberInArray {
    public static void main(String[] args) {
        int arr[] = {2, 3, 5, 9, 14, 16, 18, 19};
        int target = 211;
        System.out.println(binarySearch(arr, target));

    }

    private static int binarySearch(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (target == arr[mid]) {
                return arr[mid];
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }
        }
        return arr[end];
    }
}
