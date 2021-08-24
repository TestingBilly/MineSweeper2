package minesweeper;

import org.junit.jupiter.api.DisplayName;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class testTwo {
    @Test
    @DisplayName("Second Test")
    public void testIsBomb() {
        Block blockTest = new Block(1, 1);
        assertFalse(blockTest.isBomb(), "This is not a bomb");
        assertTrue(blockTest.isBomb(), "This is a bomb");
    }
}
