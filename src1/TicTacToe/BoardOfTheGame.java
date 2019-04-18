package TicTacToe;

import java.util.Scanner;

public class BoardOfTheGame {
    public static char[][] board;


    String player1;
    String player2;
     static int winnerCondition;

    BoardOfTheGame() {


    }


    BoardOfTheGame(String player1, String player2) {

        this.player1 = player1;
        this.player2 = player2;

    }

    public static void insertSize(int size) {

        board = new char[size][size];
        for (int i = 0; i < size; ++i) {
            for (int j = 0; j < size; ++j) {
                board[i][j] = '.';
                System.out.print(board[i][j]);

            }
            System.out.println();
        }
    }

    BoardOfTheGame(int size) {
        board = new char[size][size];

    }

    public static void acceptMove(char move, int position1, int position2) {

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

    static public boolean outOfRange(char[][] board, int position1, int position2, int size, int winnerCondition) {


        if (position1 >= size || position2 >= size || position1 < 0 || position2 < 0 || winnerCondition>board.length) {
            return true;

        }



        return false;
    }


    public static boolean checkIt(char[][] board, int winnerCondition) {

        for (int j = 0; j < board.length; j++) {
            int k = 0;
            int count1 = 0;
            for (int i = 0; i < board.length ; i++) {
                int p = 0;

    if (board[i][j + k] != '.') {
        if (j + k <= winnerCondition && i + 1 < board.length && j + k + 1 < board.length) {
            p = j + k;
            if (board[i][p] == board[i + 1][p + 1]) {
                ++count1;
                if (count1 == winnerCondition - 1) {
                    return true;
                }


            } else
                count1 = 0;
            ++k;


        } else break;


    }

}

                }



        for (int i = 0; i < board.length; ++i) {
            int k = 0;
            int count2 = 0;
            for (int j = board.length-1; j >= 0; --j) {
                int p = 0;


                     if (i + k <= winnerCondition && i + k < board.length - 1  && j-1>0 ) {
                         p = i + k;
                         if (board[p][j] == board[p + 1][j - 1]) {
                             ++count2;
                             if (count2 == winnerCondition - 1)
                                 return true;
                         } else
                             count2 = 0;
                         ++k;

                     }
                     else
                     break;

            }

        }

        for (int i = 0; i < board.length; ++i) {
            int count3 = 0;
            for (int j = 0; j < board.length ; ++j) {

                  if(board[i][j]!='.') {
                      if (j + 1 > board.length-1)
                          break;
                      else {

                          if (board[i][j] == board[i][j + 1]) {
                              ++count3;
                              if (count3 == winnerCondition - 1) {
                                  return true;

                              }

                          }else
                              count3 = 0;
                      }
                  }
            }
        }


        for (int j = 0; j < board.length; ++j) {
            int count4 = 0;
            for (int i = 0; i < board.length ; ++i) {
                if (board[i][j] != '.') {
                    if (i + 1 > board.length - 1)
                        break;
                    else {
                        if (board[i][j] == board[i + 1][j]) {
                            ++count4;
                            if (count4 == winnerCondition - 1) {
                                return true;

                            }
                        }else
                            count4 = 0;
                    }
                }
            }
        }
        return false;
    }
}
