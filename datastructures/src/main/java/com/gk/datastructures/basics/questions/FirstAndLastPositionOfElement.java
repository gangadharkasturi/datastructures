package com.gk.datastructures.basics.questions;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
 */
public class FirstAndLastPositionOfElement {

    public static void main(String[] args) {

        int arr[] = {5, 7, 7, 7, 7, 8, 8, 10};
        int target = 7;
        int ans[] = {-1, -1}; //default
        ans[0] = search(arr, target, true);
        ans[1] = search(arr, target, false);
        System.out.println(Arrays.toString(ans));
    }

    private static int search(int[] arr, int target, boolean findStartIndex) {

        int start = 0;
        int end = arr.length - 1;
        int ans = -1; //assuming the potential answer or possible answer
        while (start <= end) {
            int mid = (start + end) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if (findStartIndex) { //number may lie before the founded value, so change the end position and search again
                    end = mid - 1;
                } else { //found the other occurrence by starting the position after the founded value
                    start = mid + 1;
                }
            }
        }
        return ans;
    }


}
