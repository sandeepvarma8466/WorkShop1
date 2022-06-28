package com.blz.workshop1;

import java.util.Scanner;

public class TicTacToeGame {
    static char[] board = new char[10];
    static int i;
    public static char[] createBoard() {
        for (int i = 0; i < 9; i++) {
            board[i] = ' ';
        }
        return board;
    }
    public static void chooseLetter(){
        char player = ' ';
        char computer = ' ';
        System.out.println("Enter the Letter X or O");
        Scanner sc = new Scanner(System.in);
        char letter = sc.next().charAt(0);
        if (letter == 'X') {
            player = letter;
            computer = 'O';
            System.out.println("Player's letter is X");
            System.out.println("Computer's letter is O");
        }
        else if (letter == 'O'){
            player = 'O';
            computer = 'X';
            System.out.println("Player's letter is O");
            System.out.println("Computer's letter is X");
        }
        else {
            System.out.println("Error.You have to choose X or O only");
        }
    }
    public static void showBoard(){
        System.out.println("Play Board Display\n");
        System.out.println("|"+board[0]+"|"+board[1]+"|"+board[2]+"|\n");
        System.out.println("|"+board[3]+"|"+board[4]+"|"+board[5]+"|\n");
        System.out.println("|"+board[6]+"|"+board[7]+"|"+board[8]+"|\n");
    }
    public static void main(String[] args) {
        System.out.println("Welcome to TicTacToe game");
        createBoard();
        chooseLetter();
        showBoard();
    }
}
