package com.imc.game.strategy.play;

import com.imc.game.Play;
import com.imc.game.PlayResult;
import java.security.SecureRandom;
import java.util.Random;
import javax.annotation.Nonnull;

public interface PlayStrategy {
    Random random = new SecureRandom();

    @Nonnull
    default Play nextPlay() {
        return Play.values()[Math.abs(random.nextInt()) % Play.values().length];
    }
    default void accept(@Nonnull PlayResult playResult) {};
}
