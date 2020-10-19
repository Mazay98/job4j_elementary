package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        String[] names = new String[4];
        float[] prices = new float[40];

        for (int i = 0; i < names.length; i++) {
            names[i] = "Name #" + i;
            System.out.println(names[i]);
        }

        System.out.println("Ages " + ages.length);
        System.out.println("Surnames " + surnames.length);
        System.out.println("Prices " + prices.length);
    }
}
