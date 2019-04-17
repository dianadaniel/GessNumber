package TicTacToe;

import java.util.Scanner;

public class BoardoftheGame {
    public static char[][] board;


    String player1;
    String player2;
    int winnerCondition;

    BoardoftheGame() {

    }


    BoardoftheGame(String player1, String player2) {

        this.player1 = player1;
        this.player2 = player2;

    }

    public static void InsertSize(int size) {

        board = new char[size][size];
        for (int i = 0; i < size; ++i) {
            for (int j = 0; j < size; ++j) {
                board[i][j] = '.';
                System.out.print(board[i][j]);

            }
            System.out.println();
        }
    }

    BoardoftheGame(int size) {
        board = new char[size][size];

    }

    public static void AcceptMove(char move, int position1, int position2) {

        board[position1][position2] = move;


    }


    static public void print() {
        System.out.println();
        for (int i = 0; i < board.length; i++) {

            for (int j = 0; j < board.length; j++) {

                System.out.print(board[i][j]);

            }
            System.out.println();

        }


    }

    static public boolean WhereAreYouGoingBro(char[][] board, int position1, int position2, int size) {


        if (position1 >= size || position2 >= size || position1 < 0 || position2 < 0) {
            return true;

        }
        if (board[position1][position2] != '.')
            return true;


        return false;
    }


    public static boolean CheckIt(char[][] board, int winnerCondition) {

        for (int j = 0; j < board.length; j++) {
            int k = 0;
            int count1 = 0;
            for (int i = 0; i < board.length - 1; i++) {
                int p = 0;


                    if (j + k <= winnerCondition && j + k < board.length - 1 && i + k < board.length - 1) {
                        p = j + k;

                        if (board[i][p] == board[i + 1][p + 1]) {
                            ++count1;
                            if (count1 >= winnerCondition) {
                                return true;
                            }

                        } else
                            count1 = 0;


                        ++k;




                } else
                    break;
            }
        }
        for (int i = 0; i < board.length - 1; ++i) {
            int k = 0;
            int count2 = 0;
            for (int j = board.length; j > 0; --j) {
                int p = 0;

                    if (i + k <= winnerCondition && i + k < board.length - 1 && j + k < board.length - 1) {
                        p = i + k;
                        if (board[p][j] == board[p + 1][j - 1]) {
                            ++count2;
                            if (count2 >= winnerCondition)
                                return true;
                        } else
                            count2 = 0;
                        ++k;



                } else
                    break;
            }

        }

        for (int i = 0; i < board.length; ++i) {
            int count3 = 0;
            for (int j = 0; j < board.length - 1; ++j) {


                    if (board[i][j] == board[i][j + 1]) {


                        ++count3;
                        if (count3 >= winnerCondition) {
                            return true;

                        } else
                            count3 = 0;

                } else
                    break;

            }
        }


        for (int j = 0; j < board.length; ++j) {
            int count4 = 0;
            for (int i = 0; i < board.length - 1; ++i) {

                    if (board[i][j] == board[i + 1][j]) {
                        ++count4;
                        if (count4 >= winnerCondition) {
                            return true;

                        }else
                            count4 = 0;
                    } else
                        break;
                }




        }
        return false;

    }
}
