package com.blz.workshop1;

public class TicTacToeGame {
    static char[] board = new char[10];
    static int i;
    public static char[] ticTac() {
        for (int i = 0; i < 9; i++) {
            board[i] = ' ';
        }
        return board;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to TicTacToe game");
        System.out.println(ticTac());
    }
}
