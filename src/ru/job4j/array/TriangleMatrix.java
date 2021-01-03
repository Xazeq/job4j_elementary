package ru.job4j.array;

public class TriangleMatrix {
    public static int[][] rows(int count) {
        int[][] triangle = new int[count][];
        int counter = 1;
        int number = 1;
        for (int i = 0; i < triangle.length; i++) {
            triangle[i] = new int[counter];
            for (int j = 0; j < counter; j++) {
                triangle[i][j] = number;
                number++;
            }
            counter++;
        }
        return triangle;
    }
}
