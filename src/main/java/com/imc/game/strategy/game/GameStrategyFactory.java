package com.imc.game.strategy.game;

import com.imc.game.strategy.play.RandomStrategy;
import com.imc.game.strategy.play.UseOpponetsLastPlayWhenLostStrategy;

public class GameStrategyFactory {

    public static GameStrategy buildWeightBasedStrategy() {
        return new WeightBasedGameStrategy.Builder(new RandomStrategy(), 10)
                .addNextPlayStrategy(new UseOpponetsLastPlayWhenLostStrategy(), 20).build();
    }
}
