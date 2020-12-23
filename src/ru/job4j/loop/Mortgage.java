package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, double salary, double percent) {
        int year = 1;
        double debt = amount * percent / 100 + amount;
        while (debt > salary) {
            debt = debt * percent / 100 + debt - salary;
            year++;
        }
        return year;
    }
}
