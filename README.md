# Advanced Snake

COMP2042 coursework project: a JavaFX Snake game maintained and extended with a focused Git workflow.

## Environment

- JDK 25.0.1 (the Maven compiler targets Java 21)
- Maven Wrapper 3.9.11
- JavaFX 25.0.1
- JUnit 5.10.2

## Build and test

From this directory, set `JAVA_HOME` to the JDK root and run:

```powershell
.\mvnw.cmd test
```

The test suite covers game configuration, movement/input rules, border behavior, coin scoring, and power-up behavior.

## Run the game

```powershell
.\mvnw.cmd javafx:run
```

## Generate Javadoc

```powershell
.\mvnw.cmd javadoc:javadoc
```

The generated HTML is written to `target/reports/apidocs` and can be copied to the required submission folder as `Javadoc`.

## Current design

- `GameConfig` owns validated session settings.
- `Snake` and coin classes contain game state and rules, without JavaFX image objects.
- `GameView` owns JavaFX rendering resources.
- `GameController` owns per-session input state and game-loop coordination.

## Git workflow

The stable branch is `main`. Changes are developed on focused `feature/`, `fix/`, `refactor/`, or `docs/` branches and merged through pull requests.

## Known follow-up work

Javadoc generation and the final class diagram should be added before submission. The coursework submission also requires a demo video and an AI-use declaration where applicable.
