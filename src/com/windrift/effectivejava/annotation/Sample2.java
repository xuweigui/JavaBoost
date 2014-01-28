package com.windrift.effectivejava.annotation;

/**
 * Created by IntelliJ IDEA.
 * User: cy
 * Date: 21/05/12
 * Time: 8:17 PM
 * To change this template use File | Settings | File Templates.
 */
public class Sample2 {
    @ExceptionTest(ArithmeticException.class)
    public static void m1() { // InstantiationProcess should pass
        int i = 0;
        i = i / i;
    }
    @ExceptionTest(ArithmeticException.class)
    public static void m2() { // Should fail (wrong exception)
        int[] a = new int[0];
        int i = a[1];
    }
    @ExceptionTest(ArithmeticException.class)
    public static void m3() { } // Should fail (no exception)

}

