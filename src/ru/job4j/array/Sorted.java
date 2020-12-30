package ru.job4j.array;

public class Sorted {
    public static boolean isSorted(int[] array) {
        boolean result = true;
        for (int index = 0; index < array.length - 1; index++) {
            if (array[index] > array[index + 1]) {
                result = false;
            }
        }
        return result;
    }
}
