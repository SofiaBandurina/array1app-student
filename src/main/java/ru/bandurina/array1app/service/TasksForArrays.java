package ru.bandurina.array1app.service;

import ru.bandurina.array1app._main._Main;

import java.util.Scanner;

public class TasksForArrays {

        static Scanner scanner = new Scanner(System.in);
       static int[] array = {scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt()};

    public static void evenNumbers() {
        int ctr = 0;
        for (int i = 0; i < 10; i++) {
            if (array[i] % 2 == 0)
                ctr++;
        }
        System.out.println("Even Numbers: " + ctr);
    }

    public static void oddNumbers() {
        int ctr = 0;
        for (int i = 0; i < 10; i++) {
            if (array[i] % 2 != 0)
                ctr++;
        }
        System.out.println("Odd Numbers: " + ctr);
    }

    public static void primeNumbers() {
        int ctr = 0;
        for (int i = 0; i < 10; i++) {
            if (array[i] > 1 && array[i] / array[i] == 1 && array[i] / 1 == array[i] && array[i] % 2 != 0 && array[i] % 3 != 0 && array[i] % 4 != 0 && array[i] % 5 != 0 && array[i] % 7 != 0)
                ctr++;
            else if (array[i] == 2 || array[i] == 3 || array[i] == 5 || array[i] == 7)
                ctr++;
        }
        System.out.println("Prime Numbers: " + ctr);
    }

    public static void summNumbers() {
        int summ = array[0] + array[1] + array[2] + array[3] + array[4] + array[5] + array[6] + array[7] + array[8] + array[9];
        System.out.println("Summ of numbers: "+ summ);
    }

    public static void diffTheSummEvenAndOddIndex() {
        int diff = (array[0] + array[2] + array[4] + array[6] + array[8]) - (array[1] + array[3] + array[5] + array[7] + array[9]);
        System.out.println("Difference the sums of even and odd index: " + diff);
    }

    public static void numberOfZeros() {
        int ctr = 0;
        for (int i = 0; i < 10; i++) {
            if (array[i] == 0)
                ctr++;
        }
        System.out.println("Number of zeros: " + ctr);
    }
}
