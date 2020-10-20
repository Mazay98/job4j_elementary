package ru.job4j.array;

public class AlgoArray {
    public static int[] sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int temp;

            if (i + 1 == array.length) {
                break;
            }

            if (array[i] > array[i + 1]) {
                temp = array[i + 1];
                array[i + 1] = array[i];
                array[i] = temp;

                return sort(array);
            }

        }

        return array;
    }

    public static void main(String[] args) {
        int[] array = sort(new int[]{5, 3, 2, 1, 4});

        for (int i : array) {
            System.out.println(i);
        }
    }
}