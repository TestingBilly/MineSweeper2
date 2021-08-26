package minesweeper;

import org.junit.jupiter.api.DisplayName;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class testThree {
    Grid testGrid = new Grid(10, 10);
    @Test
    @DisplayName("Third Test")
    public void testIsUncovered() {

        System.out.println(testGrid);
        assertFalse(testGrid.selectSquare(1,1).isUncovered (), "This is uncovered");
    }
}
