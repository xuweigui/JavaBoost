package com.imc.game;

import com.imc.game.strategy.game.GameStrategy;
import com.imc.game.strategy.game.GameStrategyFactory;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Collectors;
import javax.annotation.Nonnull;

public class GameDemo {
    private static final BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));

    private static final GameStrategy gameStrategy = GameStrategyFactory.buildWeightBasedStrategy();
    private static final GameResult gameResult = new GameResult();

    public static void main(String[] args) throws IOException {
        printWelcomeMessage();

        Optional<Play> userPlay = readUserPlay();
        while (userPlay.isPresent()) {
            playOneRound(userPlay);
            userPlay = readUserPlay();
        }

        printGameResult();
    }


    private static void playOneRound(@Nonnull Optional<Play> userPlay) throws IOException {
        Play user = userPlay.get();
        Play computer = gameStrategy.nextPlayStrategy().nextPlay();
        Result result = user.check(computer);
        PlayResult playResult = new PlayResult(user, computer, result);
        gameStrategy.accept(playResult);
        gameResult.accept(playResult);
        System.out.println("Your showed: " + user + ", computer showed: " + computer + ". PlayResult is: " + playResult);
    }

    private static void printWelcomeMessage() {
        System.out.println("Welcome to Game Scissors/Paper/Rock.");
    }

    private static void printGameResult() {
        System.out.println("This is the game result: ");
        System.out.println("Win: " + gameResult.getUserWin() + ", lose: " + gameResult.getUserLose() + ", tie: " + gameResult.getTie());
        Result result = gameResult.gameResult();
        if (result == Result.WIN) {
            System.out.println("You won! Well done!");
        } else if (result == Result.LOSE) {
            System.out.println("You lost! Try next time!");
        } else {
            System.out.println("It is a tie!");
        }
    }

    private static void printInvalidInput(String input) {
        System.out.println("Invalid input: " + input);
    }

    //return Optional.empty if user quits
    @Nonnull
    private static Optional<Play> readUserPlay() throws IOException {
        System.out.println("Please input a number to play, type q to quit the game");
        System.out.println(Arrays.stream(Play.values()).map(s -> s.ordinal() + 1 + ": " + s).collect(Collectors.joining(", ")));
        String input = reader.readLine();
        boolean valid = false;
        if ("q".equalsIgnoreCase(input)) {
            return Optional.empty();
        }
        try {
            int index = Integer.parseInt(input);
            if (index < 1 || index > Play.values().length) {
                printInvalidInput(input);
                return readUserPlay();
            }
            return Optional.of(Play.values()[index - 1]);
        } catch (NumberFormatException e) {
            printInvalidInput(input);
            return readUserPlay();
        }
    }
}
