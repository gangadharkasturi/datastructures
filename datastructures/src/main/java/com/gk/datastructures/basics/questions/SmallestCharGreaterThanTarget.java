package com.gk.datastructures.basics.questions;

/**
 * https://leetcode.com/problems/find-smallest-letter-greater-than-target/
 */
public class SmallestCharGreaterThanTarget {
    public static void main(String[] args) {
        char[] chars = {'e', 'e', 'e', 'e', 'e', 'e', 'n', 'n', 'n', 'n'};
        char target = 'e';
        System.out.println(nextGreatestLetter(chars, target));
        System.out.println(nextGreatestLetterOtherWay(chars, target));
    }


    public static char nextGreatestLetter(char[] letters, char target) {

        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            if (start == letters.length) { //if it reaches the end of the array.. means element not found, so return 0th element
                return letters[0];
            }
            int mid = (start + end) / 2;
            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start];
    }


    public static char nextGreatestLetterOtherWay(char[] letters, char target) {

        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start%letters.length];
    }
}
