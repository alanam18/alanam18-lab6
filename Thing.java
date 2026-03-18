import java.util.*;
public abstract class Thing {
    public int row, col, direct, timeSinceLast;
    public char lab = 'r';
    public static final int[] dc = {0, 1, 0, -1};
    public static final int[] dr = {1, 0, -1, 0};

    public void rightTurn() {
        direct = (direct + 1) % 4;
    }

    public void leftTurn() {
        direct = (direct + 3) % 4;
    }

    public void step() {
        row += dr[direct];
        col += dc[direct];
    }

    public abstract void maybeTurn();

    public String toString() {
        return row + " " + col + " " + lab;
    }
}
