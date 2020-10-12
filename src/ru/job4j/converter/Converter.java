package ru.job4j.converter;

public class Converter {

    public static float rubleToCourse(int value, float course) {
        return value / course;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToCourse(140, 70);
        float dollar = Converter.rubleToCourse(140, 60);
        System.out.println("140 rubles are " + String.format("%.2f", euro) + " euro.");
        System.out.println("140 rubles are " + String.format("%.2f", dollar) + " dollar.");
    }
}