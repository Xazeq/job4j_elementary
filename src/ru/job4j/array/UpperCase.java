package ru.job4j.array;

public class UpperCase {
    public static char[] toUpperCase(char[] string) {
        char[] result = new char[string.length];
        for (int index = 0; index < string.length; index++) {
            if (Character.isLowerCase(string[index])) {
                result[index] = Character.toUpperCase(string[index]);
            } else {
                result[index] = string[index];
            }
        }
        return result;
    }
}
