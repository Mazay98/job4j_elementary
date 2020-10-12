package ru.job4j.calculator;

public class ArgMethod {
    public static void hello(String name, int age) {
        System.out.println("Hello, " + name + "\nAge:" + age);
    }

    public static void main(String[] args) {
        String name = "Vladimir Zaitsev";
        int age = 21;
        ArgMethod.hello(name, age);
    }
}
