package com.gk.datastructures.basics.reverse;

public class ReverseOfANumber {

    public static void main(String[] args) {
        int number = 987654321;
        int reverseNumber = 0;
        while (number != 0) {
            int reminder = number % 10;
            reverseNumber = reverseNumber * 10 + reminder;
            number = number / 10;
        }
        System.out.println("Reverse is " + reverseNumber);

    }

}
