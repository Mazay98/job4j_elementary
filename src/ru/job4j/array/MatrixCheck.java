package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;

        for (int i = 0; i < board[row].length; i++) {
            if (board[row][i] != 'X') {
                result = false;
                break;
            }
        }

        return result;
    }

    public static boolean monoVertical(char[][] board, int col) {
        boolean result = true;

        for (char[] chars : board) {
            if (chars[col] != 'X') {
                result = false;
                break;
            }
        }

        return result;
    }
}