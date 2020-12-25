package ru.job4j.loop;

public class Symmetry {
    public static boolean check(int number) {
        boolean result = false;
        String str = Integer.toString(number);
        for (int i = 0, j = str.length() - 1; i < str.length() / 2; i++, j--) {
            result = str.charAt(i) == str.charAt(j) ? true : false;
        }
        return result;
    }
}
