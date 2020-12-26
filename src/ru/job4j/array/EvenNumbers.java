package ru.job4j.array;

public class EvenNumbers {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        for (int index = 0; index < numbers.length; index++) {
            if (index % 2 == 0) {
                System.out.println(numbers[index]);
            }
        }
    }
}
