package ru.job4j.sort;

import java.util.Arrays;

public class Machine {
    private final int[] COINS = {10, 5, 2, 1};

    public int[] change(int money, int price) {
        int[] rsl = new int[100];
        int size = 0;
        int sum = money - price;
        for (int i = size; i < COINS.length; i++) {
            while (sum >= COINS[i]) {
                sum -= COINS[i];
                rsl[size] = COINS[i];
                size++;
            }
        }

        return Arrays.copyOf(rsl, size);
    }
}