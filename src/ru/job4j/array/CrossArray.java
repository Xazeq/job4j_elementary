package ru.job4j.array;

public class CrossArray {
    public static void printCrossEl(int[] left, int[] right) {
        for (int index = 0; index < left.length; index++) {
            for (int i = 0; i < right.length; i++) {
                if (left[index] == right[i]) {
                    System.out.println(left[index]);
                    break;
                }
            }
        }
    }
}
