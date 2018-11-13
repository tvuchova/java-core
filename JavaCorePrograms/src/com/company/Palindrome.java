package com.company;

import java.util.Scanner;

import static java.lang.System.in;

public class Palindrome {
    public static void main(String[] args) {
        String original, reverse = "";

        //reading the original String from console
        Scanner sn = new Scanner(in);
        System.out.println("Enter a string to check if it is a palindrome:");
        original = sn.nextLine();

        //get the length f the string
        int length = original.length();

        for (int i = length - 1; i >= 0; i--)
            reverse = reverse + original.charAt(i);

        if (original.equals(reverse))
            System.out.println("The string is a palindrome.");
        else
            System.out.println("The string isn't a palindrome.");
    }
}
