package minesweeper;


public class Grid
{
    private final Block[][] mineSweeperGrid;
    private int length;
    private int height;



    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Grid (int length, int height)
    {
        this.length = length;
        this.height = height;

        mineSweeperGrid = new Block[length][height];

        initialiseGrid();
    }


    private void initialiseGrid()
    {
        ////SET GRID UP//////
        for (int i = 0; i<length; i++)
        {
            for (int j = 0; j<height; j++)
            {
                mineSweeperGrid [i][j] = new Block(i,j);
            }
        }
    }

    public String toString()
    {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i<length; i++)
        {
            for (int j = 0; j<height; j++)
            {
                sb.append(mineSweeperGrid[i][j]);
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public Block selectSquare(int x, int y)
    {
        return this.mineSweeperGrid[x][y];
    }

}