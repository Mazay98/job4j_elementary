package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        boolean keyElement = data[0];

        for (boolean datum : data) {
            result = datum == keyElement;

            if (!result) {
                break;
            }
        }

        return result;
    }
}