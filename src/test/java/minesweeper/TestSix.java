package minesweeper;

import org.junit.jupiter.api.DisplayName;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class TestSix {
    Grid testGrid = new Grid(10, 10);
    @Test
    @DisplayName("Sixth  Test")
    public void testIsNotFlagged() {
        testGrid.selectSquare(1,1).setFlagged(false);

        System.out.println(testGrid);
        assertFalse(testGrid.selectSquare(1,1).isFlagged (), "This is notFlagged");

    }
}
