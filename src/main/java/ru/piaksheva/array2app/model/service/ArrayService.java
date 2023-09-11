package ru.piaksheva.array2app.model.service;

public class ArrayService {
    public boolean checkSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public int[] sort(int[] arr) {
        while (!checkSort(arr)) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i + 1] < arr[i]) {
                    int n = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = n;
                }
            }
        }
        return arr;
    }
}
