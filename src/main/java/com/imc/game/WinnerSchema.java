package com.imc.game;
import javax.annotation.Nonnull;

public interface WinnerSchema {
    @Nonnull Result determine(@Nonnull Symbol myself, @Nonnull Symbol opponent);
}
