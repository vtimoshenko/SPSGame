package com.rzd.pktb.SPSGame;

/**
 * Created by SimpleUser on 18.06.2016.
 */
public class gameSPS {
    public static int STONE = 0;
    public static int PAPER = 1;
    public static int SCISSORS = 2;

    public static int WON = 1;
    public static int NONE = 0;
    public static int LOSS = -1;

    private static int[][] matrix = {
            {NONE,LOSS,WON},
            {WON,NONE,LOSS},
            {LOSS,WON,NONE}
    };
    public static int fight(int player1, int player2) {
        return matrix[player1][player2];
    }
}
