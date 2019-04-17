package TicTacToe;

import java.util.Scanner;

import static TicTacToe.BoardoftheGame.*;


public class main {
   static Scanner in = new Scanner(System.in);
     static int  boardsize;
     static int winnerCondition;
     static char a ;

    public static void main(String[] args) {
        System.out.println("Please insert your name ");
        String player1 = in.nextLine();
        System.out.println("Please insert your name ");
        String player2 = in.nextLine();

        BoardoftheGame players = new BoardoftheGame(player1, player2);

        System.out.println("Please insert the size of the board. ");
         boardsize = in.nextInt();
         System.out.println("Please configure the winning condition ");
         winnerCondition = in.nextInt();
        BoardoftheGame board = new BoardoftheGame();
        BoardoftheGame size = new BoardoftheGame(boardsize);

        InsertSize(boardsize);

        f();

    }



   static void f() {


        for (int i = 0; i < (boardsize*boardsize); i++) {

            if(i%2==0){
                a='x';

            }
            else
                a='0';
            System.out.println("Please insert the coordinates");
            System.out.println(a);
            int position1 = in.nextInt();
            int position2 = in.nextInt();
            if (BoardoftheGame.WhereAreYouGoingBro(BoardoftheGame.board, position1, position2, boardsize)) {
                System.out.println("You are out of range. Please try again");
                f();
            }
            if (!CheckIt(BoardoftheGame.board, winnerCondition)) {

                BoardoftheGame.AcceptMove(a, position1, position2);
                BoardoftheGame.print();

            }

            if(CheckIt(BoardoftheGame.board, winnerCondition)==true)
            {
                System.out.print(" The game is finished. ");
                break;

            }



        }



    }
    }


