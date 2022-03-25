package ru.homework;

import java.util.Scanner;

public class ThirdHomework {

    public static void main(String[] args) {
        String[] nameAndNumberArr = getUserNameAndNumber();
        String name = nameAndNumberArr[0];
        String number = nameAndNumberArr[1];

        if (!isNumberOfDigitsAcceptable(number)){
            System.out.print("Error: число должно иметь от 2 до 5 разрядов");
            return;
        }

        System.out.printf("Здравствуй %s! Сумма цифр в числе = %s",
                name, convertNumberToString(getSumOfDigitsInNumber(number.length() - 1, number)));
    }

    static String[] getUserNameAndNumber() {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter user name and number: ");
        String userInput = scr.nextLine();
        return userInput.split(" ");
    }

    static boolean isNumberOfDigitsAcceptable(String number) {
        return (number.length() >= 2 && number.length() <= 5);
    }

    static int getSumOfDigitsInNumber(int id, String number) {
        int currentDigit = Integer.parseInt(String.valueOf(number.charAt(id)));
        return id == 0 ? currentDigit : currentDigit + getSumOfDigitsInNumber(id - 1, number);
    }

    static String convertNumberToString(int number) {
        return switch (number) {
            case (0) -> "ноль";
            case (1) -> "один";
            case (2) -> "два";
            case (3) -> "три";
            case (4) -> "четыре";
            case (5) -> "пять";
            case (6) -> "шесть";
            case (7) -> "семь";
            case (8) -> "восемь";
            case (9) -> "девять";
            default -> "десять";
        };
    }
}
