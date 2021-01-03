package ru.job4j.array;

public class TwoSquareArrays {
    public static int[] collectArray(int[][] left, int[][] right) {
        int[] result = new int[left.length * left[0].length];
        int count = 0;
        for (int i = 0; i < left.length; i++) {
            for (int j = 0; j < left[i].length; j++) {
                result[count] = left[i][j] > right[i][j] ? left[i][j] : right[i][j];
                count++;
                }
            }
        return result;
    }
}
