package ru.job4j.array;

public class MaxLengthSeria {
    public static int find(int[] array) {
        int result = 1;
        int temp = 1;
        for (int index = 1; index < array.length; index++) {
            if (array[index] >= array[index - 1]) {
                temp++;
            } else {
                result = temp;
                temp = 1;
            }
            result = temp;
        }
        return result;
    }
}
