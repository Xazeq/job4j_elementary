package ru.job4j.array;

public class SwapRows {
    public static void swap(int[][] data, int src, int dst) {
        for (int j = 0; j < data[src].length; j++) {
            int temp = data[src][j];
            data[src][j] = data[dst][j];
            data[dst][j] = temp;
        }
    }
}
