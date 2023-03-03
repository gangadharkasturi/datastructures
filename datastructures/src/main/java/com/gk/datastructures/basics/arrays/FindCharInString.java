package com.gk.datastructures.basics.arrays;

public class FindCharInString {

    public static void main(String[] args) {
        String name = "gangadhar";
        char elementToFind = 'r';
        int foundAt = getIndexOfString(name, elementToFind);
        System.out.println("Charecter found at : " + foundAt);
    }

    private static int getIndexOfString(String name, char elementToFind) {

        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == elementToFind) {
                return i;
            }
        }
        return -1;
    }
}
