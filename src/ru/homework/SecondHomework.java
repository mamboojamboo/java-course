package ru.homework;

public class SecondHomework {

    public static void main(String[] args) {

        int[] arr = {3, 22, 1, 13, 4, 6, 16, 5};
        int arrMaxInt = arr[0];
        int arrSum  = 0;
        int tmp;

        System.out.print("First exercise:");
        for (int i : arr) if (i % 2 == 0) System.out.printf(" %d", i);

        System.out.print("\nSecond exercise:");
        for (int i : arr) if (i >= 10) System.out.printf(" %d", i);

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
    }

}
