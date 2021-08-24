package minesweeper;

import org.junit.jupiter.api.DisplayName;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class testTwo {
    @Test
    @DisplayName("Second Test")
    public void testIsBomb() {
        Block blockTest = new Block(2, 2);
        blockTest.setBomb(true);
        assertTrue(blockTest.isBomb(), "This is a bomb");
    }
}
