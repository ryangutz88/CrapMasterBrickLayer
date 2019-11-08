package com.company; // Implements the game of Craps logic

public class CrapsGame
{
    private int point = 0;

    /**
     *  Calculates the result of the next dice roll in the Craps game.
     *  The parameter total is the sum of dots on two dice.
     *  point is set to the saved total, if the game continues,
     *  or 0, if the game has ended.
     *  Returns 1 if player won, -1 if player lost,
     *  0 if player continues rolling.
     */
    public int processRoll(int total)
    {
        boolean win;
        boolean loss;
        int result;
        if (point == 0) {
            win = (total == 7 || total == 11);
        }
        if (point == 0) {
            loss = (total == 2 || total == 3 || total == 12);
        } else
            { if (point != 0) {
            win = 
            }
        if (win) {
            result = 1;
            return point;
        if (loss) {
            result = -1;
            return point;
        }

        return result;
    }

    /**
     *  Returns the saved point
     */
    public int getPoint()
    {
        return point;
    }
}
