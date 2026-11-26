package com.comp2042;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SnakeTest {

    @Test
    void diesWhenCrossingTheBorderInNormalMode() {
        Snake snake = new Snake(4, 4, false, new Obstacle(4, 4));

        snake.move('U');
        snake.move('U');
        snake.move('U');

        assertTrue(snake.getDead());
        assertEquals(0, snake.getHead().y);
    }

    @Test
    void wrapsAroundTheBorderWhenBordersAreDisabled() {
        Snake snake = new Snake(4, 4, true, new Obstacle(4, 4));

        snake.move('U');
        snake.move('U');
        snake.move('U');

        assertFalse(snake.getDead());
        assertEquals(3, snake.getHead().y);
    }
}
