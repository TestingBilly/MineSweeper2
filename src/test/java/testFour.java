package minesweeper;

import org.junit.jupiter.api.DisplayName;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class testFour {

    Grid testGrid = new Grid(10, 10);


    @Test
    @DisplayName("Fourth Test")
    public void gridSize (){
        System.out.println(testGrid);
        assertEquals(10, (testGrid.height), "Grid Height is correct");
        assertEquals(10, (testGrid.length), "Grid Length is correct");

    }
}
