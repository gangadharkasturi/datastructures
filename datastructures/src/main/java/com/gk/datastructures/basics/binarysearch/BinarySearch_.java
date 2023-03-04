package com.gk.datastructures.basics.binarysearch;

public class BinarySearch_ {

    public static void main(String[] args) {
        int arr[] = {1,5,8,15,19,21,28,35,60,70,90,99};
        int target = 19;
        System.out.println(findElement(arr, target));
    }

    private static int findElement(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
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
}
