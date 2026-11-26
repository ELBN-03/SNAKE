package com.comp2042;

/**
 * Immutable settings used to create a game session.
 */
public final class GameConfig {
    private static final int DEFAULT_GRID_WIDTH = 20;
    private static final int DEFAULT_GRID_HEIGHT = 20;
    private static final boolean DEFAULT_POWER_UPS_ENABLED = true;
    private static final char DEFAULT_DIFFICULTY = 'N';

    private final int gridWidth;
    private final int gridHeight;
    private final boolean powerUpsEnabled;
    private final char difficulty;

    public GameConfig(int gridWidth, int gridHeight, boolean powerUpsEnabled, char difficulty) {
        if (gridWidth < 2 || gridHeight < 2) {
            throw new IllegalArgumentException("The game grid must be at least 2 by 2.");
        }
        if (difficulty != 'E' && difficulty != 'N' && difficulty != 'H') {
            throw new IllegalArgumentException("Difficulty must be E, N, or H.");
        }

        this.gridWidth = gridWidth;
        this.gridHeight = gridHeight;
        this.powerUpsEnabled = powerUpsEnabled;
        this.difficulty = difficulty;
    }

    public static GameConfig defaultConfig() {
        return new GameConfig(
                DEFAULT_GRID_WIDTH,
                DEFAULT_GRID_HEIGHT,
                DEFAULT_POWER_UPS_ENABLED,
                DEFAULT_DIFFICULTY
        );
    }

    public int getGridWidth() {
        return gridWidth;
    }

    public int getGridHeight() {
        return gridHeight;
    }

    public boolean isPowerUpsEnabled() {
        return powerUpsEnabled;
    }

    public char getDifficulty() {
        return difficulty;
    }
}
