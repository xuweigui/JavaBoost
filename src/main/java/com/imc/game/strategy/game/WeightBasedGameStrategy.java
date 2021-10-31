package com.imc.game.strategy.game;

import com.imc.game.PlayResult;
import com.imc.game.strategy.play.PlayStrategy;
import java.security.SecureRandom;
import java.util.NavigableMap;
import java.util.Random;
import java.util.TreeMap;
import javax.annotation.Nonnull;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public class WeightBasedGameStrategy implements GameStrategy {

    private final NavigableMap<Double, PlayStrategy> weightedActionStrategies;
    private final double totalWeight;
    private static final Random random = new SecureRandom();


    @Nonnull
    @Override
    public PlayStrategy nextPlayStrategy() {
        double rand = random.nextDouble() * totalWeight;
        return weightedActionStrategies.higherEntry(rand).getValue();
    }

    @Override
    public void accept(@Nonnull PlayResult playResult) {
        weightedActionStrategies.values().forEach(s -> s.accept(playResult));
    }

    @NoArgsConstructor(access = AccessLevel.PRIVATE)
    public static class Builder {
        private final NavigableMap<Double, PlayStrategy> weightedActionStrategies = new TreeMap<>();
        private double totalWeight = 0;

        public Builder(@Nonnull PlayStrategy strategy, int weight) {
            addNextPlayStrategy(strategy, weight);
        }

        @Nonnull
        public Builder addNextPlayStrategy(@Nonnull PlayStrategy strategy, int weight) {
            //the strategy is ignored if invalid weight provided
            if (weight <= 0) return this;

            totalWeight += weight;
            weightedActionStrategies.put(totalWeight, strategy);
            return this;
        }

        @Nonnull
        public WeightBasedGameStrategy build() {
            if (weightedActionStrategies.isEmpty()) throw new IllegalStateException("No play strategy available");
            return new WeightBasedGameStrategy(weightedActionStrategies, totalWeight);
        }
    }
}
