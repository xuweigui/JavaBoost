package com.windrift.effectivejava.enums.operation;

/**
 * Created by IntelliJ IDEA.
 * User: cy
 * Date: 21/05/12
 * Time: 11:21 AM
 * To change this template use File | Settings | File Templates.
 */
public enum BasicOperation implements Operation{
    ADD("+") {
        @Override
        public double apply(double x, double y) {
            return x + y;
        }
    },
    MINUS("-") {
        @Override
        public double apply(double x, double y) {
            return x - y;
        }
    },
    TIMES("*") {
        @Override
        public double apply(double x, double y) {
            return x * y;
        }
    },
    DIVIDE("/") {
        @Override
        public double apply(double x, double y) {
            return x / y;
        }
    };


    private final String symbol;

    BasicOperation(String s) {
        symbol = s;
    }
    @Override
    public String toString() {
        return symbol;
    }
}
