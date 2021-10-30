package com.imc.game;

import javax.annotation.Nonnull;

public class CommonWinnerSchema implements WinnerSchema {
    @Override
    @Nonnull
    public Result determine(@Nonnull Symbol myself, @Nonnull Symbol opponent) {
        if (myself == opponent) {
            return Result.tie;
        }
        if (Symbol.Paper == myself) {
            return opponent == Symbol.Rock ? Result.win : Result.loose;
        }

        if (Symbol.Scissors == myself) {
            return opponent == Symbol.Paper ? Result.win : Result.loose;
        }

        //myself == Rock
        return opponent == Symbol.Scissors ? Result.win : Result.loose;
    }
}
