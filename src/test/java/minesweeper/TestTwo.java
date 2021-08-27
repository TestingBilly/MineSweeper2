package minesweeper;



import org.junit.jupiter.api.DisplayName;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTwo {
    Grid testGrid = new Grid(10, 10);
    @Test
    @DisplayName("Second Test")
    public void testIsBomb() {
        System.out.println(testGrid);
        testGrid.selectSquare(1,1).setBomb(false);
        assertFalse(testGrid.selectSquare(1,1).isBomb (), "This is not a bomb");

    }
}