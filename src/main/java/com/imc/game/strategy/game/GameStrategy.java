package com.imc.game.strategy.game;

import com.imc.game.PlayResult;
import com.imc.game.strategy.play.PlayStrategy;
import javax.annotation.Nonnull;

/**
 * Game strategy use a profolio of {@link PlayStrategy} to play the game
 * Choose {@link #nextPlayStrategy} for the next play
 */
public interface GameStrategy {
    void accept(@Nonnull PlayResult playResult);
    PlayStrategy nextPlayStrategy();
}
