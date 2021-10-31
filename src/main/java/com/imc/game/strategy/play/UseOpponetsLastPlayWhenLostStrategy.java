package com.imc.game.strategy.play;

import com.imc.game.Play;
import com.imc.game.PlayResult;
import com.imc.game.Result;
import javax.annotation.Nonnull;

public class UseOpponetsLastPlayWhenLostStrategy implements PlayStrategy {

    private PlayResult prePlayResult;

    @Nonnull
    @Override
    public Play nextPlay() {
        if(prePlayResult == null) {
            //no previous result, call the default
            return PlayStrategy.super.nextPlay();
        } else if (prePlayResult.getResult() == Result.WIN) {
            return prePlayResult.getMyself();
        } else {
            return prePlayResult.getOpponent();
        }
    }

    @Override
    public void accept(@Nonnull PlayResult playResult) {
        prePlayResult = playResult;
    }
}
