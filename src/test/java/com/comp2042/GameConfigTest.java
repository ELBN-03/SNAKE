package com.comp2042;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class GameConfigTest {

    @Test
    void suppliesTheExpectedDefaultGameSettings() {
        GameConfig config = GameConfig.defaultConfig();

        assertEquals(20, config.getGridWidth());
        assertEquals(20, config.getGridHeight());
        assertTrue(config.isPowerUpsEnabled());
        assertEquals('N', config.getDifficulty());
    }

    @Test
    void retainsCustomValidSettings() {
        GameConfig config = new GameConfig(30, 25, false, 'H');

        assertEquals(30, config.getGridWidth());
        assertEquals(25, config.getGridHeight());
        assertFalse(config.isPowerUpsEnabled());
        assertEquals('H', config.getDifficulty());
    }

    @Test
    void rejectsInvalidGridSizesAndDifficulties() {
        assertThrows(IllegalArgumentException.class, () -> new GameConfig(1, 20, true, 'N'));
        assertThrows(IllegalArgumentException.class, () -> new GameConfig(20, 1, true, 'N'));
        assertThrows(IllegalArgumentException.class, () -> new GameConfig(20, 20, true, 'X'));
    }
}
