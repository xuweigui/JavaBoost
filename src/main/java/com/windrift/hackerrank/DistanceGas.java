package com.windrift.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DistanceGas {

    private static final int TANK_CAPACITY_IN_LITRE = 50;
    private static final int LITER_PER_KILO = 1;

    public static int calculate(List<Integer> distances, List<Integer> prices) {
        return calculate(0, distances, prices);
    }

    public static int calculate(int currentFeulInLitre, List<Integer> distances, List<Integer> prices) {
        int remainingStations = distances.size();
        int priceAtCurrentStation = prices.get(0);
        if (remainingStations == 1) {
            return (distances.get(0) / LITER_PER_KILO - currentFeulInLitre) * prices.get(0);
        }

        int fuelNeededToNextStation = distances.get(0) / LITER_PER_KILO;
        //at least needs to be able to travel to next station
        int amountToFill = currentFeulInLitre > fuelNeededToNextStation? 0: (fuelNeededToNextStation - currentFeulInLitre);

        //"maxAmoutToFill >= amountToFill" is aways true to start with
        int maxAmoutToFill = TANK_CAPACITY_IN_LITRE - currentFeulInLitre;

        int nextCheckpoint = 1;
        for (nextCheckpoint = 1; (nextCheckpoint < remainingStations) && (prices.get(nextCheckpoint) > priceAtCurrentStation); nextCheckpoint++) {
            amountToFill += (distances.get(nextCheckpoint) / LITER_PER_KILO);
            if (amountToFill >= maxAmoutToFill) {
                amountToFill = maxAmoutToFill;
                break;
            }
        }
        int costAtCurrentStation = amountToFill * priceAtCurrentStation;
        if (nextCheckpoint == remainingStations) {
            return amountToFill * priceAtCurrentStation;
        }

        int remainingDistance = distances.stream().reduce(0, Integer::sum);
        if (remainingDistance <= (currentFeulInLitre + amountToFill)/ LITER_PER_KILO) {
            return costAtCurrentStation;
        }
        return costAtCurrentStation + calculate(currentFeulInLitre + amountToFill - distances.get(0),
                distances.subList(1 , remainingStations), prices.subList(1, remainingStations));
        }
}
