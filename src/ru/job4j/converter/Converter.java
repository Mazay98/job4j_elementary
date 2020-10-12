package ru.job4j.converter;

public class Converter {

    public static int rubleToCourse(int value, float course) {
        return (int) (value / course);
    }

    public static void main(String[] args) {
        int rubbles = 140;
        int euro = Converter.rubleToCourse(rubbles, 70);
        int dollar = Converter.rubleToCourse(rubbles, 60);

        System.out.println(rubbles + " rubles are " + euro + ". Test result : " + Converter.testRubleToCourse(euro, 2));
        System.out.println(rubbles + " rubles are " + dollar + ". Test result : " + Converter.testRubleToCourse(dollar, 2));
    }

    private static boolean testRubleToCourse(int out, int excepted) {
        return out == excepted;
    }
}