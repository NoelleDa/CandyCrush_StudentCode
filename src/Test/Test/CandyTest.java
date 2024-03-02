package Test;

import CandyCrush.Candy;
import CandyCrush.Grid;
import org.junit.Assert;
import org.junit.Test;

public class CandyTest {

    @Test
    public void testFindMax1() {
        Grid grid = new Grid();

        Candy[] candyArray = new Candy[4];
        candyArray[0] = new Candy("Blue");
        candyArray[1] = new Candy("Blue");
        candyArray[2] = new Candy("Green");
        candyArray[3] = new Candy("Blue");

        int[] result = grid.findMaximum(candyArray);
        Assert.assertEquals(2, result[0]);
        Assert.assertEquals(0, result[1]);

    }

    @Test
    public void testFindMax2() {
        Grid grid = new Grid();

        Candy[] candyArray = new Candy[4];
        candyArray[0] = new Candy("Green");
        candyArray[1] = new Candy("Red");
        candyArray[2] = new Candy("Blue");
        candyArray[3] = new Candy("Green");

        int[] result = grid.findMaximum(candyArray);
        Assert.assertEquals(1, result[0]);
        Assert.assertEquals(0, result[1]);
    }

    @Test
    public void testFindMax3() {
        Grid grid = new Grid();

        Candy[] candyArray = new Candy[8];
        candyArray[0] = new Candy("Green");
        candyArray[1] = new Candy("Green");
        candyArray[2] = new Candy("Red");
        candyArray[3] = new Candy("Red");
        candyArray[4] = new Candy("Green");
        candyArray[5] = new Candy("Green");
        candyArray[6] = new Candy("Green");
        candyArray[7] = new Candy("Red");

        int[] result = grid.findMaximum(candyArray);
        Assert.assertEquals(3, result[0]);
        Assert.assertEquals(4, result[1]);
    }

    @Test
    public void testAdjacent1() {
        Grid grid = new Grid();

        int row1 = 1;
        int col1 = 0;
        int row2 = 1;
        int col2 = 2;

        boolean result = grid.isAdjacent(row1, col1, row2, col2);
        Assert.assertFalse(result);
    }

    @Test
    public void testAdjacent2() {
        Grid grid = new Grid();

        int row1 = 1;
        int col1 = 0;
        int row2 = 1;
        int col2 = 1;

        boolean result = grid.isAdjacent(row1, col1, row2, col2);
        Assert.assertTrue(result);
    }

    @Test
    public void testAdjacent3() {
        Grid grid = new Grid();

        int row1 = 0;
        int col1 = 0;
        int row2 = 1;
        int col2 = 1;

        boolean result = grid.isAdjacent(row1, col1, row2, col2);
        Assert.assertFalse(result);
    }

    @Test
    public void testAdjacent4() {
        Grid grid = new Grid();

        int row1 = 1;
        int col1 = 0;
        int row2 = 0;
        int col2 = 0;

        boolean result = grid.isAdjacent(row1, col1, row2, col2);
        Assert.assertFalse(result);
    }

    @Test
    public void testInARow() {
        Candy[][] testGrid = new Candy[4][4];

        testGrid[0][0] = new Candy("Blue");
        testGrid[1][0] = new Candy("Green");
        testGrid[2][0] = new Candy("Green");
        testGrid[3][0] = new Candy("Red");
        testGrid[0][1] = new Candy("Blue");
        testGrid[1][1] = new Candy("Red");
        testGrid[2][1] = new Candy("Green");
        testGrid[3][1] = new Candy("Green");
        testGrid[0][2] = new Candy("Green");
        testGrid[1][2] = new Candy("Blue");
        testGrid[2][2] = new Candy("Green");
        testGrid[3][2] = new Candy("Red");
        testGrid[0][3] = new Candy("Blue");
        testGrid[1][3] = new Candy("Green");
        testGrid[2][3] = new Candy("Red");
        testGrid[3][3] = new Candy("Green");

        Grid grid = new Grid();
        grid.setGrid(testGrid);

        int result = grid.inARow();

        Assert.assertEquals(2, result);

    }

    @Test
    public void testInAACol() {
        Candy[][] testGrid = new Candy[4][4];

        testGrid[0][0] = new Candy("Blue");
        testGrid[1][0] = new Candy("Green");
        testGrid[2][0] = new Candy("Green");
        testGrid[3][0] = new Candy("Red");
        testGrid[0][1] = new Candy("Blue");
        testGrid[1][1] = new Candy("Red");
        testGrid[2][1] = new Candy("Green");
        testGrid[3][1] = new Candy("Green");
        testGrid[0][2] = new Candy("Green");
        testGrid[1][2] = new Candy("Blue");
        testGrid[2][2] = new Candy("Green");
        testGrid[3][2] = new Candy("Red");
        testGrid[0][3] = new Candy("Blue");
        testGrid[1][3] = new Candy("Green");
        testGrid[2][3] = new Candy("Red");
        testGrid[3][3] = new Candy("Green");

        Grid grid = new Grid();
        grid.setGrid(testGrid);

        int result = grid.inAColumn();

        Assert.assertEquals(-1, result);
    }

    @Test
    public void testSwapspace1() {
        Candy[][] testGrid = new Candy[4][4];

        testGrid[0][0] = new Candy("Blue");
        testGrid[1][0] = new Candy("Green");
        testGrid[2][0] = new Candy("Green");
        testGrid[3][0] = new Candy("Red");
        testGrid[0][1] = new Candy("Blue");
        testGrid[1][1] = new Candy("Red");
        testGrid[2][1] = new Candy("Green");
        testGrid[3][1] = new Candy("Green");
        testGrid[0][2] = new Candy("Green");
        testGrid[1][2] = new Candy("Blue");
        testGrid[2][2] = new Candy("Green");
        testGrid[3][2] = new Candy("Red");
        testGrid[0][3] = new Candy("Blue");
        testGrid[1][3] = new Candy("Green");
        testGrid[2][3] = new Candy("Red");
        testGrid[3][3] = new Candy("Green");

        Grid grid = new Grid();
        grid.setGrid(testGrid);

        grid.swapSpaces(2,1, 3, 2);

        Assert.assertEquals("Red", grid.getValue(2, 1).getColor());
        Assert.assertEquals("Green", grid.getValue(3, 2).getColor());


    }
}
