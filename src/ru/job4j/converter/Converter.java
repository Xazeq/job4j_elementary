package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        int dollar = Converter.rubleToDollar(180);
        System.out.println("180 rubles are " + dollar + " dollars.");

        int in = 4200;

        int expectedEuro = 60;
        int out = Converter.rubleToEuro(in);
        boolean passed = expectedEuro == out;
        System.out.println("4200 rubles are 60 euro. Test result : " + passed);

        int expectedDollar = 70;
        out = Converter.rubleToDollar(in);
        passed = expectedDollar == out;
        System.out.println("4200 rubles are 70 dollars. Test result : " + passed);
    }
}
