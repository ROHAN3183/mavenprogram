package com.example;

public class ReverseArray {

    public static int[] reverse(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {   // ✅ no semicolon
            result[i] = arr[n - i - 1];
        }

        return result;
    }
}