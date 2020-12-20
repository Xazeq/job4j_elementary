package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        int result = third;
        if (first > second) {
            if (first > result) {
                result = first;
            }
        } else if (second > result) {
            result = second;
        }
        return result;
    }
}