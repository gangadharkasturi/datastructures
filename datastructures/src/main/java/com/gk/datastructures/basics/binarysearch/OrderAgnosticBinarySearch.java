package com.gk.datastructures.basics.binarysearch;

/**
 * This binary search supports both the orders ascending and descending...
 * You can check if an array is ascending or descending by checking comparing the first and last elements
 * if first element is less than last element it is ascending order, if first element is greater than second element it is descending order.
 */
public class OrderAgnosticBinarySearch {

    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int arr2[] = {9, 8, 7, 6, 5, 4, 3, 2};
        int target1 = 6;
        int target2 = 3;
        System.out.println(binarySearch(arr1, target1)); //searching in ascending order array
        System.out.println(binarySearch(arr2, target2)); //searching in descending order array
    }

    private static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAscending = arr[start] < arr[end]; //if first element is less than last element it is ascending else descending
        while (start <= end) {
            int mid = (start + end) / 2;
            if (target == arr[mid]) {
                return mid;
            }
            if (isAscending) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                }
            } else {
                if (target < arr[mid]) {
                    start = mid + 1;
                } else if (target > arr[mid]) {
                    end = mid - 1;
                }
            }

        }
        return -1;
    }
}
