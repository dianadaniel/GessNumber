package TicTacToe;

import java.util.Scanner;

import static TicTacToe.BoardOfTheGame.*;


public class main {
   static Scanner in = new Scanner(System.in);
     static int  boardsize;
     static int winnerCondition;
     static char a ;
      static String player1;
     static String player2;

    public static void main(String[] args) {
        System.out.println("Please insert your name ");
         player1 = in.nextLine();
        System.out.println("Please insert your name ");
         player2 = in.nextLine();

        BoardOfTheGame players = new BoardOfTheGame(player1, player2);

        System.out.println("Please insert the size of the board. ");
         boardsize = in.nextInt();
         System.out.println("Please configure the winning condition ");
         winnerCondition = in.nextInt();
        BoardOfTheGame board = new BoardOfTheGame();
        BoardOfTheGame size = new BoardOfTheGame(boardsize);

        insertSize(boardsize);

        f();

    }



   static void f() {


         {
            int position1;
            int position2;
           int sum=1;
          int i=0;
             do
            {
                if (i % 2 == 0)
                {a = 'x'; }
                else
                { a = '0';}
                System.out.println(a);
                System.out.println("Please insert the coordinates");
                position1 = in.nextInt();
                position2 = in.nextInt();

                if (BoardOfTheGame.outOfRange(BoardOfTheGame.board, position1, position2, boardsize, winnerCondition)) {
                    System.out.println("You are out of range. Please try again");
                    f();


                }
                else {
                    BoardOfTheGame.acceptMove(a, position1, position2);
                    BoardOfTheGame.print();
                    i++;
                }

                ++sum;
            }
             while (checkIt(BoardOfTheGame.board, winnerCondition)==false && i<(boardsize*boardsize));

            if(checkIt(BoardOfTheGame.board, winnerCondition)==true)
            {   System.out.println(" The game is finished. ");
                if(sum%2==0){
                    System.out.print("The winner is "+player1+"!");
                }
                else
                    System.out.print("The winner is "+player2+"!");



            }



        }



    }
    }


