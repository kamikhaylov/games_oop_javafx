package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean rsl = false;
        for (int index = 0; index < board.length; index++) {
            if (board[index][index] == 1) {
                for (int i = 0; i < board.length; i++) {
                    if ((monoHorizontal(board, i) || monoVertical(board, i))) {
                        rsl = true;
                        break;
                    }
                }
            }
        }
        return rsl;
    }

    public static boolean monoHorizontal(int[][] board, int row) {
        boolean result = true;
        for (int index = 0; index < board[row].length; index++) {
            if (board[row][index] != 1) {
                result = false;
                break;
            }
        }
        return result;
    }
    public static boolean monoVertical(int[][] board, int column) {
        boolean result = true;
        for (int index = 0; index < board[column].length; index++) {
            if (board[index][column] != 1) {
                result = false;
                break;
            }
        }
        return result;
    }
    public static int[] extractDiagonal(int[][] board) {
        int[] rsl = new int[board.length];
        for (int index = 0; index < rsl.length; index++) {
            rsl[index] = board[index][index];
        }
        return rsl;
    }
}
