package com.gk.datastructures.basics.questions;

/**
 * Here we have two seperate methods for ascending and descending order based binary search
 */
public class FindInMountainArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 7, 9, 15, 20, 10, 8, 6, -1};
        int target = 2;
        int peakIndex = peakIndex(arr);
        int ansIndex = binarySearchInAsc(arr, 0, peakIndex, target);
        if (ansIndex == -1) {
            ansIndex = binarySearchInDsc(arr, peakIndex, arr.length - 1, target);
        }
        System.out.println("Index Number : " + ansIndex);
    }

    private static int peakIndex(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = (start + end) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return end;
    }

    private static int binarySearchInAsc(int arr[], int start, int end, int target) {
        while (start <= end) {
            int mid = (start + end) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    private static int binarySearchInDsc(int arr[], int start, int end, int target) {
        while (start <= end) {
            int mid = (start + end) / 2;
            if (target < arr[mid]) {
                start = mid + 1;
            } else if (target > arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
