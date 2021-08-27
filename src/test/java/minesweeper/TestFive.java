//package minesweeper;
//
//import org.junit.jupiter.api.DisplayName;
//import org.testng.annotations.Test;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//public class TestFive {
//
//    Grid testGrid = new Grid(10, 10);
//
//    @Test
//    @DisplayName("Fifth Test")
//    public void bombCounter (){
//        testGrid.selectSquare(0,1).setBomb(true);
//        testGrid.selectSquare(1,0).setBomb(true);
//
//        System.out.println(testGrid);
//        assertEquals(2, (testGrid.selectSquare(0,0).bombsNextTo), "bombNextTo works");
//
//    }
//}
//