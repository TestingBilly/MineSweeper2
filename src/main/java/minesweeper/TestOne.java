package minesweeper;
import org.junit.jupiter.api.DisplayName;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;



public class TestOne
{
    @Test
    @DisplayName("First Test")
    public void testGetName(){
        Block block = new Block(1,1);
        assertEquals(1,1,"This worked?");
    }
}

