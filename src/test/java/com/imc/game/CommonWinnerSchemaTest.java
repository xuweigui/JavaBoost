package com.imc.game;

import org.junit.Assert;
import org.junit.Test;

public class CommonWinnerSchemaTest {
    @Test
    public void testCommonWinnerSchema() {
        WinnerSchema winnerSchema = new CommonWinnerSchema();
        Assert.assertEquals(Result.tie, winnerSchema.determine(Symbol.Rock, Symbol.Rock));
        Assert.assertEquals(Result.tie, winnerSchema.determine(Symbol.Paper, Symbol.Paper));
        Assert.assertEquals(Result.tie, winnerSchema.determine(Symbol.Scissors, Symbol.Scissors));

        Assert.assertEquals(Result.win, winnerSchema.determine(Symbol.Scissors, Symbol.Paper));
        Assert.assertEquals(Result.win, winnerSchema.determine(Symbol.Rock, Symbol.Scissors));
        Assert.assertEquals(Result.win, winnerSchema.determine(Symbol.Paper, Symbol.Rock));

        Assert.assertEquals(Result.loose, winnerSchema.determine(Symbol.Scissors, Symbol.Rock));
        Assert.assertEquals(Result.loose, winnerSchema.determine(Symbol.Rock, Symbol.Paper));
        Assert.assertEquals(Result.loose, winnerSchema.determine(Symbol.Paper, Symbol.Scissors));

    }
}
