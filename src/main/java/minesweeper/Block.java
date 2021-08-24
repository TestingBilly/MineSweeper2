package minesweeper;


public class Block
{
    private boolean isBomb;
    private boolean isUncovered;
    private int [][] bombsNextTo;
    private boolean isFlagged;

    public int y;
    public int x;


    public boolean isBomb() {
        return isBomb;
    }

    public void setBomb(boolean bomb) {
        isBomb = bomb;
    }

    public boolean isUncovered() {
        return isUncovered;
    }

    public void setUncovered(boolean uncovered) {
        isUncovered = uncovered;
    }

    public int[][] getBombsNextTo() {
        return bombsNextTo;
    }

    public void setBombsNextTo(int[][] bombsNextTo) {
        this.bombsNextTo = bombsNextTo;
    }

    public boolean isFlagged() {
        return isFlagged;
    }

    public void setFlagged(boolean flagged) {
        isFlagged = flagged;
    }

    public  int getY() {
        return y;
    }


    public int getX() {
        return x;
    }

    public Block(int x, int y)
    {
        this.x = x;
        this.y = y;

        float randomBombing = (float) Math.random();
        float ratioOfBombs = 0.25f;
        if (randomBombing <= ratioOfBombs)
        {
            isBomb = true;
        }
        else
        {
            isBomb= false;
        }


    }
    //  public int nearBombs(int x, int y)
//  {
//      int no = 0;
//      for (int offsetX=-1; offsetX<=1; offsetX++)
//      {
//          for (int offsetY=-1; offsetY<=1; offsetY++)
//          {
//              no+=bombsNextTo[offsetX+x][offsetY+y];
//           }
//      }
//     return no;
    //}
    public String toString ()
    {
        if (isBomb && isUncovered)
        {
            return "X";
        }
        if (!isBomb && isUncovered)
        {
            // return "" + nearBombs(this.x,this.y) + "";
            return "0";
        }

        return "[" + x + y + "]";
    }
}