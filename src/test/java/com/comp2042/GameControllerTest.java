package com.comp2042;

import javafx.scene.input.KeyCode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class GameControllerTest {

    @Test
    void rejectsDirectionChangesThatWouldReverseTheSnake() {
        assertFalse(GameController.isValidDirectionChange(KeyCode.LEFT, KeyCode.RIGHT));
        assertFalse(GameController.isValidDirectionChange(KeyCode.RIGHT, KeyCode.LEFT));
        assertFalse(GameController.isValidDirectionChange(KeyCode.UP, KeyCode.DOWN));
        assertFalse(GameController.isValidDirectionChange(KeyCode.DOWN, KeyCode.UP));
    }

    @Test
    void acceptsPerpendicularDirectionChangesOnly() {
        assertTrue(GameController.isValidDirectionChange(KeyCode.LEFT, KeyCode.UP));
        assertTrue(GameController.isValidDirectionChange(KeyCode.DOWN, KeyCode.RIGHT));
        assertFalse(GameController.isValidDirectionChange(KeyCode.LEFT, KeyCode.SPACE));
    }

    @Test
    void mapsEachPowerUpRollToTheExpectedCoinKind() {
        assertEquals(GameController.CoinKind.GOLD, GameController.coinKindForRoll(1, true));
        assertEquals(GameController.CoinKind.RAINBOW, GameController.coinKindForRoll(2, true));
        assertEquals(GameController.CoinKind.BLUE, GameController.coinKindForRoll(3, true));
        assertEquals(GameController.CoinKind.SILVER, GameController.coinKindForRoll(4, true));
        assertEquals(GameController.CoinKind.STANDARD, GameController.coinKindForRoll(4, false));
        assertEquals(GameController.CoinKind.STANDARD, GameController.coinKindForRoll(0, true));
    }
}
