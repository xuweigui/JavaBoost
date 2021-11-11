package com.optiver;

import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class ForeignExchangeTest {
    @Test
    public void test1() {
        Assert.assertEquals(0.74, ForengeExchange.exchange("AUD", "USD", Arrays.asList("AUDUSD@0.74")), 0.001);
    }

    @Test
    public void test2() {
        Assert.assertEquals(5.18, ForengeExchange.exchange("AUD", "CNY", Arrays.asList("AUDUSD@0.74", "USDCNY@7")), 0.001);
    }

    @Test
    public void test3() {
        Assert.assertEquals(5.18, ForengeExchange.exchange("AUD", "CNY", Arrays.asList("AUDNZD@1.2", "AUDUSD@0.74", "USDCNY@7")), 0.001);
    }

    @Test
    public void test4() {
        Assert.assertEquals(7, ForengeExchange.exchange("AUD", "CNY", Arrays.asList("AUDJPY@1.2", "AUDUSD@0.74", "NZDAUD@0.85", "AUDCNY@7")), 0.001);
    }

    @Test
    public void test_loop() {
        //todo this found the long path, not the shortest one.
        Assert.assertEquals(5.18, ForengeExchange.exchange("AUD", "CNY", Arrays.asList("AUDNZD@1.2", "AUDUSD@0.74", "NZDAUD@0.85", "USDCNY@7")), 0.001);
    }
}
