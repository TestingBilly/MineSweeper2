package minesweeper;

import java.util.Scanner;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import gherkin.formatter.model.Feature;
import gherkin.formatter.model.Scenario;

public class Main
{
    public static void main (String[] args)
    {
       //@When("^The player plays the Game$")
        Grid currentGame = new Grid(10, 10);
        boolean gameOver = false;


        while(!gameOver)
        {
           // @Then("^the currentGame Grid is printed$")
            System.out.println(currentGame);
            int inputX;
            int inputY;
            System.out.println("Enter the first number of the block you want to check");

            Scanner playerX = new Scanner(System.in);

            inputX =playerX.nextInt();
            playerX.nextLine();

            System.out.println("Enter the second number of the block you want to check");
            Scanner playerY = new Scanner(System.in);

            inputY =playerY.nextInt();
            playerY.nextLine();

            currentGame.selectSquare(inputX,inputY).setUncovered(true);
            if (currentGame.selectSquare(inputX,inputY).isBomb())
            {
                System.out.println(currentGame);
                System.out.print("Ooops Game Over");
                gameOver = true;
                break;
            }

        }

    }

}

////Make game playable
////win/loss conditions
////make flags work
