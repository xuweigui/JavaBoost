package com.imc.game;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public interface Strategy {
    @Nonnull
    //myPreSymbol, opponentPreSymbol and preResult all be null or non-null
    Symbol nextSymbol(@Nullable Symbol myPreSymbol, @Nullable Symbol opponentPreSymbol, @Nullable Result preResult);
}
