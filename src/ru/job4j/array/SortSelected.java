package ru.job4j.array;

public class SortSelected {

    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int temp;

            if (i + 1 == data.length) {
                break;
            }

            if (data[i] > data[i + 1]) {
                temp = data[i + 1];
                data[i + 1] = data[i];
                data[i] = temp;

                return sort(data);
            }

        }

        return data;
    }
}