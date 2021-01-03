package ru.job4j.array;

public class EvenPrint {
    public static void print(int[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[array.length - 1 - index] % 2 == 0) {
                System.out.println(array[array.length - 1 - index]);
            }
        }
    }
}
