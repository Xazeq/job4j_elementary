package ru.job4j.array;

public class UnionThreeArrays {
    public static int[] union(int[] left, int[] middle, int[] right) {
        int[] result = new int[2 + middle.length / 2 + right.length / 2];
        result[0] = left[0];
        result[result.length - 1] = left[left.length - 1];
        int count1 = 0;
        int count2 = 0;
        for (int index = 1; index < result.length - 1; index++) {
            if (index % 2 == 0) {
                for (int i = count1; i < middle.length; i++) {
                    if (i % 2 != 0) {
                        result[index] = middle[i];
                        count1 += 2;
                        break;
                    }
                }
            } else {
                for (int i = count2; i < right.length; i++) {
                    if (i % 2 == 0) {
                        result[index] = right[i];
                        count2 += 2;
                        break;
                    }
                }
            }
        }
        return result;
    }
}
