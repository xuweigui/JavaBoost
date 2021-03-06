package com.windrift.effectivejava.enums.operation;

/**
 * Created by IntelliJ IDEA.
 * User: cy
 * Date: 21/05/12
 * Time: 11:27 AM
 * To change this template use File | Settings | File Templates.
 */
public enum ExtendedOperation implements Operation{
    EXP("^") {
        @Override
        public double apply(double x, double y) {
            return Math.pow(x, y);
        }
    },
    REMAINDER("%") {
        @Override
        public double apply(double x, double y) {
            return x % y;
        }
    };


    private final String symbol;

    ExtendedOperation (String s) {
        symbol = s;
    }
    @Override
    public String toString () {
        return symbol;
    }

}
