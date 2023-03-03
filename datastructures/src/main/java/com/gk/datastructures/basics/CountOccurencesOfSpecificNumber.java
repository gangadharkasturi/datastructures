package com.gk.datastructures.basics;

import java.math.BigInteger;

public class CountOccurencesOfSpecificNumber {

    public static void main(String[] args) {
        int number = 13131;
        int digitToFind = 1;
        System.out.println(findNumberOfOccurencesOfDigit(number, digitToFind));
    }

    private static int findNumberOfOccurencesOfDigit(int number, int digitToFind) {
        int count = 0;
        while (number != 0) {
            int reminder = number % 10;
            if (reminder == digitToFind) {
                count++;
            }
            number = number / 10;
        }
        return count;
    }
}
