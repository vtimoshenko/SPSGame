package com.rzd.pktb.SPSGame;

/**
 * Created by SimpleUser on 18.06.2016.
 */
public interface playerSPS {
    /**
     * Участвовать в игре. Показать один из знаков
     * @return
     */
    int fight();
    /**
     * Указать игроку результат предыдущего кона.
     * @param result Результат игры предыдущего кона (ничья/виграл/проиграл)
     * @param enemyStep Указать какой знак показал противник (камень/ножницы/бумага)
     */
    void result(int result, int enemyStep);
    /**
     * Информация об игроке
     * @return строка описание класса-игрока и/или разработчика
     */
    String about();
}
