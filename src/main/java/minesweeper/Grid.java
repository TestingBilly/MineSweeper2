package minesweeper;


public class Grid {
    private final Block[][] mineSweeperGrid;
    int length;
    int height;

    public Grid(int length, int height) {
        this.length = length;
        this.height = height;

        mineSweeperGrid = new Block[length][height];

        initialiseGrid();
    }

    private void initialiseGrid() {
        ////SET GRID UP//////
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < height; j++) {
                mineSweeperGrid[i][j] = new Block(i, j);
                }
            }
        {           for(int i = 0;
                    i< 10;
                    i++)
                    for (int j = 0; j < 10; j++) {
                        int adjMines = 0;
                        if (i > 0 && j > 0 && mineSweeperGrid[ i- 1][j - 1].isBomb()) {
                            adjMines++;
                        }
                        if (j > 0 && mineSweeperGrid[i][j - 1].isBomb()) {
                            adjMines++;
                        }
                        if (i < 9 && j> 0 && mineSweeperGrid[i + 1][j - 1].isBomb()) {
                            adjMines++;
                        }
                        if (i > 0 && mineSweeperGrid[i - 1][j].isBomb()) {
                            adjMines++;
                        }
                        if (i < 9 && mineSweeperGrid[i + 1][j].isBomb()) {
                            adjMines++;
                        }
                        if (i > 0 && j < 9 && mineSweeperGrid[i - 1][j+ 1].isBomb()) {
                            adjMines++;
                        }
                        if (j <9 && mineSweeperGrid[i][j + 1].isBomb()){
                            adjMines++;
                        }
                        if (i< 9 && j < 9 && mineSweeperGrid[i + 1][j + 1].isBomb()) {
                            adjMines++;
                        }
                        mineSweeperGrid[i][j].setBombsNextTo(adjMines);
                    }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < height; j++) {
                sb.append(mineSweeperGrid[i][j]);
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public Block selectSquare(int x, int y) {
        return this.mineSweeperGrid[x][y];
    }


}