package com.rzd.pktb.SPSGame;

/**
 * Описание игры камень, ножницы бумага
 *
 * Created by SimpleUser on 18.06.2016.
 */
public class gameSPS {
    /**
     * Камень
     */
    @SPSStep
    public static int STONE = 0;
    /**
     * Бумага
     */
    @SPSStep
    public static int PAPER = 1;
    /**
     * Ножницы
     */
    @SPSStep
    public static int SCISSORS = 2;
    /**
     * Выиграл
     */
    @SPSResult
    public static int WON = 1;
    /**
     * Ничья
     */
    @SPSResult
    public static int NONE = 0;
    /**
     * Проиграл
     */
    @SPSResult
    public static int LOSS = -1;
    /**
     * Матрица определения победителя
     */
    private static int[][] matrix = {
            {NONE,LOSS,WON},
            {WON,NONE,LOSS},
            {LOSS,WON,NONE}
    };
    /**
     * Сыграть кон. Принимаем знаки от двух игроков.
     * @param player1 Что показал первый игрок
     * @param player2 Что показал второй игрок
     * @return Результат для первого игрока (проиграл/выиграл/ничья)
     */
    public static int fight(int player1, int player2) {
        return matrix[player1][player2];
    }
}
