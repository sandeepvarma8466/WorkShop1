package com.blz.workshop1;

import java.util.Scanner;

public class TicTacToeGame {
    static Scanner sc = new Scanner(System.in);
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
        System.out.println("\nSelect the position to in board from range [0 - 8] : ");
        int playerSelect = sc.nextInt();
        char playerSymbol = 0;
        switch (playerSelect) {
            case 0: if (board[0] == ' ')
                board[0] = playerSymbol;
                break;
            case 1: if (board[1] == ' ')
                board[1] = playerSymbol;
                break;
            case 2: if (board[2] == ' ')
                board[2] = playerSymbol;
                break;
            case 3: if (board[3] == ' ')
                board[3] = playerSymbol;
                break;
            case 4: if (board[4] == ' ')
                board[4] = playerSymbol;
                break;
            case 5: if (board[5] == ' ')
                board[5] = playerSymbol;
                break;
            case 6: if (board[6] == ' ')
                board[6] = playerSymbol;
                break;
            case 7: if (board[7] == ' ')
                board[7] = playerSymbol;
                break;
            case 8: if (board[8] == ' ')
                board[8] = playerSymbol;
                break;
            default:
                System.out.println("Invalid Position ! Restart game");
        }
        showBoard();
    }
}
