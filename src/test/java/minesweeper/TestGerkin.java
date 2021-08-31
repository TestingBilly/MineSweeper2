package minesweeper;

import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import gherkin.formatter.model.Feature;
import gherkin.formatter.model.Scenario;

import java.awt.*;

public class TestGerkin
{
    Feature : Playing the Game
    Scenario: Player starts the game
        When the player plays the game
        Then the currentGame Grid is printed

}
