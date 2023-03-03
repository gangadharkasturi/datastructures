package com.gk.datastructures.basics.arrays;

import java.util.Arrays;

public class ArraySwap {

    public static void main(String[] args) {
        int arr[] = {1,93,45,23,22,121,87,-2};
        swap(arr, 3,6);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int arr[], int sourceIndex, int targetIndex){
        int temp = arr[targetIndex];
        arr[targetIndex] = arr[sourceIndex];
        arr[sourceIndex] = temp;
    }
}
