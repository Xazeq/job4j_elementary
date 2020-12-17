package ru.job4j.calculator;

public class ArgMethod {

    public static void hello (String name){
        System.out.println("Hello " + name);
    }

    public static void main(String[] args) {
        String name = "Nikita";
        int age = 24;

        ArgMethod.hello(name);

        ArgMethod.hello(name);

        ArgMethod.hello(name);

        ArgMethod.hello(name);

    }
}
