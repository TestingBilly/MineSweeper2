package minesweeper;

import org.junit.jupiter.api.DisplayName;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class testTwo {
    Grid testGrid = new Grid(10, 10);
    @Test
    @DisplayName("Second Test")
    public void testIsBomb() {
        System.out.println(testGrid);
        testGrid.selectSquare(1,1).setBomb(false);

        assertFalse(testGrid.selectSquare(1,1).isBomb (), "This is not a bomb");

    }
}
