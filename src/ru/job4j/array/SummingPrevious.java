package ru.job4j.array;

public class SummingPrevious {
    public static int[] calculate(int a, int b, int n) {
        int[] array = new int[n];
        array[0] = a;
        array[1] = b;
        int temp = 3;
        for (int index = 2; index < array.length; index++) {
            array[index] = temp;
            temp += array[index];
        }
        return array;
    }
}
