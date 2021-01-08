package com.company;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(isPalindrome(number));
        scanner.close();
    }

    public static boolean isPalindrome(int number) {
        if (number < 0) {
            number = -number;
        }
        int lengthNumber = getLengthNumber(number);
        for (int i = 0; i < (lengthNumber / 2); i++) {
            int firstNumeral = (number / exponentiate(10, lengthNumber - 1 - i)) % 10;
            int lastNumeral = (number / exponentiate(10, i)) % 10;
            if (firstNumeral != lastNumeral) {
                return false;
            }
        }
        return true;
    }

    private static int getLengthNumber(int number) {
        int lengthNumber = 0;
        if (number >= 0 && number < 10) {
            return 1;
        } else {
            while (number >= 1) {
                number = number / 10;
                lengthNumber++;
            }
            return lengthNumber;
        }
    }

    private static int exponentiate(int firstNumber, int secondNumber) {
        int number = 1;
        for (int i = 0; i < secondNumber; i++) {
            number = number * firstNumber;
        }
        return number;
    }
}
