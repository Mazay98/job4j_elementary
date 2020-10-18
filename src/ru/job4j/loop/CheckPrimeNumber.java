package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        int countNumbers = 0;
        boolean prime = true;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                countNumbers++;
            }

            if (countNumbers > 2 || number <= 1) {
                prime = false;
                break;
            }
        }

        return prime;
    }
}