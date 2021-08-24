package minesweeper;


public class Block
{
    private Block[][] pinger;
    private boolean isBomb;
    private boolean isUncovered = true;
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

    public Block[][] getPinger() {
        return pinger;
    }

    public void setPinger(Block[][] pinger) {
        this.pinger = pinger;
    }

    public int getBombsNextTo() {
        return bombsNextTo;
    }

    public void setBombsNextTo(int bombsNextTo) {
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
    public void checkNearBombs(int a,int b){
        for(int i = -1; i <= 1; i++){
            for(int j = -1; j <= 1; j++){
                if(a+i >= 0 && a+i <= 9 && b+j >= 0 && b+j <= 9){
                    if(i==0 && j==0){}
                    else{
                        if (pinger[a+i][b+j].isBomb) {
                            pinger[a][b].bombsNextTo++;}}
                }
            }
        }
    }
    private void bombCounter(){
            for(int a = 0; a <= x-1; a++)
            {
                for(int b = 0; b <= y-1; b++)
                {
                    checkNearBombs(a,b);
                }
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