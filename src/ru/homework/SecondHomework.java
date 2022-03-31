package ru.homework;

import java.util.Scanner;

public class SecondHomework {

    // First part variables
    public static int[] arr = {3, 22, 1, 13, 4, 6, 16, 5};
    public static int arrMaxInt = arr[0];
    public static int arrSum  = 0;
    public static int tmp;

    // Second part variables
    public static int[][] scanArray = new int[4][3];
    public static int lineSum;
    public static int[] colSum = new int[3];
    public static int[] revScanArray = new int[12];
    public static int counter = 0;

    public static void main(String[] args) {

        System.out.print("FIRST PART:\n");
        System.out.print("First exercise:");
        for (int i : arr) if (i % 2 == 0) System.out.printf(" %d", i);

        System.out.print("\nSecond exercise:");
        for (int i : arr) if (i >= 10 && i < 100) System.out.printf(" %d", i);

        System.out.print("\nThird exercise:");
        for (int i : arr) if (i > arrMaxInt) arrMaxInt = i;
        System.out.printf(" %d", arrMaxInt);

        System.out.print("\nFourth exercise:");
        for (int i : arr) arrSum += i;
        System.out.printf(" %d", arrSum);

        System.out.print("\nFifth exercise:");
        for (int i = 0, j = arr.length - 1; i <= (arr.length - 1) / 2; i++, j--) {
            tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }
        for (int num : arr) {
            System.out.printf(" %d", num);
        }
        System.out.print("\n\n\n");

        System.out.print("SECOND PART:\n");
        Scanner scr = new Scanner(System.in);
        for (int i = 0; i < scanArray.length; i++) {
            for (int j = 0; j < scanArray[i].length; j++) {
                scanArray[i][j] = scr.nextInt();
            }
        }
        System.out.print("Scan array:\n");
        for (int[] ints : scanArray) {
            for (int j = 0; j < ints.length; j++) {
                if (j == 2) System.out.printf("%d\n", ints[j]);
                else System.out.printf("%d\t", ints[j]);
            }
        }

        System.out.print("\nFirst, second and fourth exercise:\n");
        for (int i = 0; i < scanArray.length; i++) {
            lineSum = 0;
            for (int j = 0; j < scanArray[i].length; j++) {
                lineSum += scanArray[i][j];
                colSum[j] += scanArray[i][j];
            }
            System.out.printf("Line %d: %d\n", (i + 1), lineSum);
            System.out.printf("Mean of line %d: %d\n", (i + 1), lineSum / 3);
        }
        for (int i = 0; i < colSum.length; i++) {
            System.out.printf("Column %d: %d\n", (i + 1), colSum[i]);
        }


        System.out.print("\nFifth exercise:");
        for (int i = scanArray.length - 1; i >= 0; i--) {
            for (int j = scanArray[i].length - 1; j >= 0; j--) {
                revScanArray[counter++] = scanArray[i][j];
            }
        }
        for (int num : revScanArray) {
            System.out.printf(" %d", num);
        }

        System.out.print("\n\nThird exercise:\n");
        for (int i = 0; i < scanArray.length; i++) {
            for (int j = 0; j < scanArray[i].length; j++) {
                if (scanArray[i][j] % 2 == 0) scanArray[i][j] = 0;
                else scanArray[i][j] = 1;
            }
        }
        for (int[] ints : scanArray) {
            for (int j = 0; j < ints.length; j++) {
                if (j == 2) System.out.printf("%d\n", ints[j]);
                else System.out.printf("%d\t", ints[j]);
            }
        }


    }

}
