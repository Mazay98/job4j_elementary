package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int one, int two, int three) {
        int tmp = max(one, two);
        return max(tmp, three);
    }

    public static int max(int one, int two, int three, int four) {
        int tmpFirst = max(one, two);
        int tmpSecond = max(three, four);
        return max(tmpFirst, tmpSecond);
    }
}
