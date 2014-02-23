package com.windrift.effectivejava.enums;

/**
 * Created by IntelliJ IDEA.
 * User: cy
 * Date: 20/05/12
 * Time: 10:39 PM
 * To change this template use File | Settings | File Templates.
 */
public enum Operation1 {
    ADD         {public double apply (double x, double y) { return x + y;}},
    MINUS       {public double apply (double x, double y) { return x - y;}},
    MULTIPLY    {public double apply (double x, double y) { return x * y;}},
    DIVIDE      {public double apply (double x, double y) { return x / y;}};

    public abstract double apply (double x, double y);
    
    public static void main (String[] args) {
        System.out.println(Operation1.ADD.apply(5,8));
        System.out.println(Operation1.MINUS.apply(5,8));
        System.out.println(Operation1.MULTIPLY.apply(5,8));
        System.out.println(Operation1.DIVIDE.apply(5,8));


        double x = 5;
        double y = 8;
        for (Operation2 op : Operation2.values())
            System.out.printf("%f %s %f = %f%n",
                    x, op, y, op.apply(x, y));
    }
}


enum Operation2{
    ADD ("+")        {public double apply (double x, double y) { return x + y;}},
    MINUS("-")       {public double apply (double x, double y) { return x - y;}},
    MULTIPLY("*")    {public double apply (double x, double y) { return x * y;}},
    DIVIDE("/")      {public double apply (double x, double y) { return x / y;}};

    private final String symbol;
    private Operation2(String symbol) {
        this.symbol = symbol;    
    }
    public abstract double apply (double x, double y);
    
    @Override public String toString() { return symbol;}
}
