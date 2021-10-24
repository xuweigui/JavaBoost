package com.windrift.hackerrank;

import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class DistanceGasTest {
    List<Integer> distances;
    List<Integer> prices;

    @Test
    public void test1() {
        distances = Arrays.asList(20, 19, 18, 17, 16, 15);
        prices = Arrays.asList(2, 3, 4, 5, 2, 3);
        Assert.assertEquals(120, DistanceGas.calculate(distances, prices));
    }

    @Test
    public void test2() {

        distances = Arrays.asList(10, 10, 10, 30);
        prices = Arrays.asList(2, 3, 4, 5);
        Assert.assertEquals(130, DistanceGas.calculate(distances, prices));
    }

    @Test
    public void test3() {
        distances = Arrays.asList(10, 10);
        prices = Arrays.asList(5, 10);
        Assert.assertEquals(100, DistanceGas.calculate(distances, prices));
    }

    @Test
    public void test4() {
        distances = Arrays.asList(10, 10, 50, 50);
        prices = Arrays.asList(5, 10, 10, 10);
        Assert.assertEquals(950, DistanceGas.calculate(distances, prices));
    }
}
