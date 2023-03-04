package com.gk.datastructures.basics.questions;

import java.util.Scanner;

public class CeilingAndFloorOfANumber {
    public static void main(String[] args) {
        int arr[] = {2, 3, 5, 9, 24, 26, 28, 29};
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number:");
            int target = sc.nextInt();
            System.out.println("Floor : " + floorElement(arr, target));
            System.out.println("Ceil  : " + ceilElement(arr, target));
            continue;
        }
    }

    private static int ceilElement(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (target == arr[mid]) {
                return target;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        if (start < arr.length) { // exception case if ceil doesn't exist
            return -1;
        } else {
            return arr[end];
        }
    }

    private static int floorElement(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (target == arr[mid]) {
                return target;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        if (end >= 0) { //exception case if floor doesn't exist
            return -1;
        } else {
            return arr[start];
        }
    }

}
