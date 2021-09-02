package minesweeper;

//Feature: Playing the Game
//        Scenario: Player starts the game
//        When The player plays the Game
//        Then The currentGame Grid is Printed

import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import cucumber.runtime.PendingException;


public class StepDefinitions {
    @When("^Player starts the game$")
    public void player_starts_the_game (int arg1) throws Exception{

        throw new PendingException();
    }
    @Then("^the currentGame Grid is printed$")
    public void the_currentGame_Grid_is_printed (int arg1) throws Exception{

        throw new PendingException();
    }
}

