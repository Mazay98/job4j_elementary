package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int nullIndex = 0; nullIndex < array.length; nullIndex++) {
            if (array[nullIndex] == null) {
                for (int index = nullIndex + 1; index < array.length; index++) {
                    if (array[index] != null) {
                        String temp = array[nullIndex];
                        array[nullIndex] = array[index];
                        array[index] = temp;
                        break;
                    }
                }
            }
        }

        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}