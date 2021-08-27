package minesweeper;


import java.util.Random;

public class Block
{
    private boolean isBomb;
    private boolean isUncovered;
    int bombsNextTo;
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

    public boolean isFlagged() {
        return isFlagged;
    }

    public void setFlagged(boolean flagged) {
        isFlagged = flagged;
    }

    public void setBombsNextTo(int bombsNextTo) {
        this.bombsNextTo = bombsNextTo;
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

    public String toString ()
    {
        if (isBomb && isUncovered)
        {
            return "[X]";
        }
        if (!isBomb && isUncovered)
        {

            return "[" + bombsNextTo + "]";
        }
        if (isFlagged)
        {
            return "[P]";
        }

        return "[" + x + y + "]";
    }
}