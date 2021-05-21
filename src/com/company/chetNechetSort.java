package com.company;

import java.util.Arrays;

public class chetNechetSort {
    public static int[] arr = {56, 1, 67, 8, 888, 551};

    public static int counter = 0;
    public static boolean isSwapped = false;

    public static void main(String[] args) {

        System.out.println(Arrays.toString(arr));
        chetNechet(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(counter);

    }

    public static void chetNechet(int[] A) {
        int temp;
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < A.length - 1; i = i + 2) {
                counter++;
                if (A[i] > A[i + 1]) {
                    temp = A[i];
                    A[i] = A[i + 1];
                    A[i + 1] = temp;
                    sorted = false;
                }
            }
            for (int i = 1; i < A.length - 1; i = i + 2) {
                counter++;
                if (A[i] > A[i + 1]) {
                    temp = A[i];
                    A[i] = A[i + 1];
                    A[i + 1] = temp;
                    sorted = false;
                }
            }
        }
    }
}

