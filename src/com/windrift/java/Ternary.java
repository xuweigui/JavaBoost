package com.windrift.java;

/**
 * Created by IntelliJ IDEA.
 * User: cy
 * Date: 7/06/12
 * Time: 2:48 PM
 * To change this template use File | Settings | File Templates.
 */
public class Ternary

{

    public static void main(String args[])

    {

        int a = 5;

        System.out.println("Value is - " + ((a < 5) ? 9.9 : 9));
        System.out.println("Value is - " + ((a < 5) ? 10 : 9));

    }

}

/*
D is correct.

The code compiles successfully. In this code the optional value for the ternary operator,
9.0(a double) and 9(an int) are of different types.
The result of a ternary operator must be determined at the compile time,
and here the type chosen using the rules of promotion for binary operands, is double.
Since the result is a double, the output value is printed in a floating point format.
The choice of which value to be printed is made on the basis of the result of the comparison
`a < 5` which results in false, hence the variable `a` takes the second of the two possible values,
which is 9, but because the result type is promoted to double, the output value is actually written as 9.0,
rather than the more obvious 9, hence D is correct.


*/