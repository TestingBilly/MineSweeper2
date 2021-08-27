package minesweeper;

import org.junit.jupiter.api.DisplayName;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestFour {

    Grid testGrid = new Grid(10, 10);


    @Test
    @DisplayName("Fourth Test")
    public void gridSize (){
        System.out.println(testGrid);
        assertEquals(9, (testGrid.selectSquare(9,9).x), "Grid Height is correct");
        assertEquals(9, (testGrid.selectSquare(9,9).y), "Grid Length is correct");

    }
}

