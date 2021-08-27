package minesweeper;

import org.junit.jupiter.api.DisplayName;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class TestSix {
    Grid testGrid = new Grid(10, 10);
    @Test
    @DisplayName("Third Test")
    public void testIsNotFlagged() {

        System.out.println(testGrid);
        assertFalse(testGrid.selectSquare(1,1).isFlagged (), "This is notFlagged");

    }
}
