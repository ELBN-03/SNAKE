package com.comp2042;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CoinTest {

    @Test
    void awardsTheExpectedPointsForEachCoinType() {
        Obstacle obstacle = new Obstacle(10, 10);
        Snake snake = new Snake(10, 10, false, obstacle);

        assertEquals(5, new Coin(10, 10, snake, obstacle).getPoints());
        assertEquals(5, new BlueCoin(10, 10, snake, obstacle).getPoints());
        assertEquals(15, new GoldCoin(10, 10, snake, obstacle).getPoints());
        assertEquals(5, new RainbowCoin(10, 10, snake, obstacle).getPoints());
        assertEquals(5, new SilverCoin(10, 10, snake, obstacle).getPoints());
    }

    @Test
    void suppliesTheRainbowCoinSpeedBonus() {
        Obstacle obstacle = new Obstacle(10, 10);
        Snake snake = new Snake(10, 10, false, obstacle);

        assertEquals(5, new RainbowCoin(10, 10, snake, obstacle).getSpeedBonus());
    }
}
