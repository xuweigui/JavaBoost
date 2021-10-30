package com.imc.game;

import java.security.SecureRandom;
import java.util.Random;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;


public class RandomStrategy implements Strategy {
    private Random random = new SecureRandom();
    private static final int numberOfSymbols = Symbol.values().length;
    @Nonnull
    @Override
    public Symbol nextSymbol(@Nullable Symbol myPreSymbol, @Nullable Symbol opponentPreSymbol, @Nullable Result preResult) {
        return Symbol.values()[Math.abs(random.nextInt()) % numberOfSymbols];
    }
}
