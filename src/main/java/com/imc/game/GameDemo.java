package com.imc.game;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Collectors;

public class GameDemo {
    private static final BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));

    private static final Strategy strategy = new RandomStrategy();
    private static final WinnerSchema winnerSchema = new CommonWinnerSchema();

    public static void main(String[] args) throws IOException {
        System.out.println("Welcome to Game Scissors/Paper/Rock.");
        printSelectionInstruction();
        String input = reader.readLine();
        int userWin = 0;
        int userLoose = 0;
        int tie = 0;
        Symbol userPreviousSymbol = null;
        Symbol computerPreviousSymbol = null;
        Result preResult = null;
        while (!"q".equalsIgnoreCase(input)) {
            try {
                int index = Integer.parseInt(input);
                if (index < 1 || index > Symbol.values().length) {
                    printInvalidInput(input);
                    printSelectionInstruction();
                    input = reader.readLine();
                } else {
                    Symbol user = Symbol.values()[index - 1];
                    Symbol computer = strategy.nextSymbol(computerPreviousSymbol, userPreviousSymbol, preResult);
                    Result result = winnerSchema.determine(user, computer);
                    if (result == Result.win) {
                        userWin++;
                    } else if (result == Result.loose) {
                        userLoose++;
                    } else {
                        tie++;
                    }

                    userPreviousSymbol = user;
                    computerPreviousSymbol = computer;
                    preResult = result;

                    System.out.println("Your showed: " + user + ", computer showed: " + computer + ". Result is: " + result);

                    printSelectionInstruction();
                    input = reader.readLine();

                }

            } catch (NumberFormatException e) {
                printInvalidInput(input);
                printSelectionInstruction();
                input = reader.readLine();
            }

        }

        printGameResult(userWin, userLoose, tie);

    }

    private static void printGameResult(int win, int loose, int tie) {
        System.out.println("This is the game result: ");
        System.out.println("Win: " + win + ", loose: " + loose + ", tie: " + tie);
        if (win > loose) {
            System.out.println("You won! Well done!");
        } else if (win < loose) {
            System.out.println("You lost! Try next time!");
        } else {
            System.out.println("It is a tie!");
        }
    }

    private static void printInvalidInput(String input) {
        System.out.println("Invalid input: " + input);
    }

    private static void printSelectionInstruction() {
        System.out.println("Please input a number to play, type q to quit the game");
        System.out.println(Arrays.stream(Symbol.values()).map(s -> s.ordinal() + 1 + ": " + s).collect(Collectors.joining(", ")));
    }
}
