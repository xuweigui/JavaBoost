package com.windrift.hackerrank;

import java.util.List;
import java.util.stream.Collectors;

public class DistanceGas {

    private static final int TANK_CAPACITY_IN_LITRE = 50;
    private static final int LITER_PER_KILO = 1;

    public static int calculate(List<Integer> distances, List<Integer> prices) {
        System.out.println("distances: " + distances.stream().map(Object::toString).collect(Collectors.joining(",")));
        System.out.println("prices: " + prices.stream().map(Object::toString).collect(Collectors.joining(",")));
        return calculate(0, distances, prices);
    }

    private static int calculate(int currentFeulAmount, List<Integer> distances, List<Integer> prices) {
        int remainingStations = distances.size();
        int priceAtCurrentStation = prices.get(0);
        if (remainingStations == 1) {
            int amountToFill = (distances.get(0) / LITER_PER_KILO - currentFeulAmount);
            return (distances.get(0) / LITER_PER_KILO - currentFeulAmount) * priceAtCurrentStation;
        }

        int fuelNeededToNextStation = distances.get(0) / LITER_PER_KILO;
        //at least needs to be able to travel to next station
        int amountToFill = currentFeulAmount > fuelNeededToNextStation? 0: (fuelNeededToNextStation - currentFeulAmount);

        //"maxAmoutToFill >= amountToFill" is aways true to start with
        int maxAmoutToFill = TANK_CAPACITY_IN_LITRE - currentFeulAmount;
        int nextCheckpoint = 1;
        for (nextCheckpoint = 1; (nextCheckpoint < remainingStations) && (prices.get(nextCheckpoint) > priceAtCurrentStation); nextCheckpoint++) {
            amountToFill += (distances.get(nextCheckpoint) / LITER_PER_KILO);
            if (amountToFill >= maxAmoutToFill) {
                amountToFill = maxAmoutToFill;
                break;
            }
        }

        //we are not at the end, but we got a cheeper station, let's fill minimum amount to reach there
        if (nextCheckpoint < remainingStations && prices.get(nextCheckpoint) < priceAtCurrentStation) {
            int distanceToNextCheeperStation = distances.subList(0, nextCheckpoint).stream().mapToInt(Integer::intValue).sum();
            if (distanceToNextCheeperStation / LITER_PER_KILO < (amountToFill + currentFeulAmount)) {
                amountToFill = distanceToNextCheeperStation - currentFeulAmount;
                int costAtCurrentStation = amountToFill * priceAtCurrentStation;
                //move to the station that is cheaper then current
                return costAtCurrentStation + calculate(0, subList(distances, nextCheckpoint),subList(prices, nextCheckpoint));
            }
        }

        int costAtCurrentStation = amountToFill * priceAtCurrentStation;
        int remainingDistance = distances.stream().mapToInt(Integer::intValue).sum();
        if (remainingDistance <= (currentFeulAmount + amountToFill)/ LITER_PER_KILO) {
            return costAtCurrentStation;
        }

        //move to next station
        return costAtCurrentStation + calculate(currentFeulAmount + amountToFill - distances.get(0),
                distances.subList(1 , remainingStations), prices.subList(1, remainingStations));
    }

    private static List<Integer> subList(List<Integer> list, int fromIndex) {
        return list.subList(fromIndex, list.size());
    }
}
