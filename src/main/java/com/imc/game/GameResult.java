package com.imc.game;

import lombok.Data;

@Data
public class GameResult {
    private int userWin = 0;
    private int userLose = 0;
    private int tie = 0;

    public void accept(PlayResult playResult) {
        Result result = playResult.getResult();
        if (result == Result.WIN) {
            userWin++;
        } else if (result == Result.LOSE) {
            userLose++;
        } else {
            tie++;
        }
    }

    public Result gameResult() {
        if (userWin > userLose) return Result.WIN;
        if (userWin == userLose) return Result.TIE;
        return Result.LOSE;
    }
}
