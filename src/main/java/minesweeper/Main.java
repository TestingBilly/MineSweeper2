package minesweeper;

import java.util.Scanner;

public class Main
{
    public static void main (String[] args)
    {
        Grid currentGame = new Grid(10, 10);
        boolean gameOver = false;




        while(!gameOver)
        {
            System.out.println(currentGame);
            int inputX;
            int inputY;

          //  System.out.println("Enter the first number of the block you want to check");
            System.out.println("Enter the first number of the block you want to check");

            Scanner playerX = new Scanner(System.in);

            inputX =playerX.nextInt();
            playerX.nextLine();

            System.out.println("Enter the second number of the block you want to check");
            Scanner playerY = new Scanner(System.in);

            inputY =playerY.nextInt();
            playerY.nextLine();

            if (currentGame.selectSquare(inputX,inputY).isBomb())
            {
                System.out.println(currentGame);
                System.out.print("Ooops Game Over");
                gameOver = true;
            }


        }


    }

}

////Make game playable
////win/loss conditions
////Make next to bombs number work
////make flags work
