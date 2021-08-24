package minesweeper;

import org.junit.jupiter.api.DisplayName;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class testThree {
    @Test
    @DisplayName("Third Test")
    public void testIsUncovered() {
        Block blockTestThree = new Block(1, 1);
        assertFalse(blockTestThree.isUncovered(), "This is not uncovered");
        assertTrue(blockTestThree.isUncovered(), "This is uncovered");


    }
}
