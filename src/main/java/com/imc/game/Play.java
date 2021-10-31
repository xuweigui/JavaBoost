package com.imc.game;

import javax.annotation.Nonnull;

public enum Play {
    Scissor {
        @Nonnull
        @Override
        public Result check(@Nonnull Play opponent) {
            if (opponent == Paper) return Result.WIN;
            if (opponent == Rock) return Result.LOSE;
            return Result.TIE;
        }
    },
    Paper {
        @Nonnull
        @Override
        public Result check(@Nonnull Play opponent) {
            if (opponent == Rock) return Result.WIN;
            if (opponent == Scissor) return Result.LOSE;
            return Result.TIE;
        }
    },
    Rock {
        @Nonnull
        @Override
        public Result check(@Nonnull Play opponent) {
            if (opponent == Scissor) return Result.WIN;
            if (opponent == Paper) return Result.LOSE;
            return Result.TIE;
        }
    };

    @Nonnull
    public abstract Result check(@Nonnull Play opponent);
}
