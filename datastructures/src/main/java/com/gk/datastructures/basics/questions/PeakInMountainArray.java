package com.gk.datastructures.basics.questions;

public class PeakInMountainArray {
    public static void main(String[] args) {
        int arr[] = {0,2,1,0};
        System.out.println(findPeak(arr));
    }

    private static int findPeak(int[] arr) {
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
        return arr[end];
    }
}
